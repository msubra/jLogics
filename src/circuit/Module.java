/*
 * Created on Jul 27, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package circuit;

import gates.ByPassGate;
import gates.DC;
import gates.Gate;
import gates.LED;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import node.Node;
import shape.DigitalObject;

/**
 * @author Mahesh,Indu
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Module extends Gate {
	
	DigitalCircuit cir;
	boolean reconstruct = false;
	
	public Module(DigitalCircuit cir) {
		super("Module",0,0,System.currentTimeMillis());
		this.cir = cir;
		this.setLabel(cir.getLabel());
	}
	
	synchronized public void draw(Graphics2D g) {
		simulate();
		super.draw(g);
		g.draw(this);
	
		if(!reconstruct) {
			reconstruct = true;
			ArrayList in = this.getInputComponents();
			for (Iterator i = in.iterator(); i.hasNext();) {
				Node g1 = (Node) i.next();
				g1.setParent(this);
				
			}

			in = this.getOutputComponents();
			for (Iterator i = in.iterator(); i.hasNext();) {
				Node g1 = (Node) i.next();
				g1.setParent(this);
				
			}
		}
	}
	
//	public void toModule() {
//		int count_in = 0, count_out = 0;
//		Vector v = cir.getComponents();
//		for (Iterator i = v.iterator(); i.hasNext();) {
//			SObject obj = (SObject)i.next();
//			Gate g = null;
//			if( obj instanceof Gate)
//				g = (Gate) obj; 
//			
//			if(g instanceof DC) {
//				ArrayList v1 = g.getOutputNode(0).connections;
//				for (Iterator j = v1.iterator(); j.hasNext();) {
//					Node n = (Node) j.next();
//					n.setID(count_in++);
//					n.setParent(this);
//					inputs.add(n);
//				}
//				g.delete();
//			}
//			else if(g instanceof LED) {
//				Node from = g.getInputNode(0).from;
//				from.setID(count_out++);
//				from.setParent(this);
//				
//				outputs.add(from);
//				g.delete();
//				from.clearConnections();
//			}
//		}
//	}
	

	public void toModule() {
		int count_in = 0, count_out = 0;
		Vector v = cir.getComponents();
		for (Iterator i = v.iterator(); i.hasNext();) {
			DigitalObject obj = (DigitalObject)i.next();
			Gate g = null;
			if( obj instanceof Gate)
				g = (Gate) obj; 
			
			if(g instanceof DC) {
				ByPassGate bp = new ByPassGate();
				cir.add(bp);
				
				Node n1 = bp.getInputNode(0);
				this.inputs.add(n1);
				n1.setParent(this);
				n1.setID(count_in++);
				
				ArrayList v1 = g.getOutputNode(0).connections;
				for (Iterator j = v1.iterator(); j.hasNext();) {
					Node n = (Node) j.next();
					bp.getOutputNode(0).connect(n);
				}
				//g.delete();
			}
			else if(g instanceof LED) {
				ByPassGate bp = new ByPassGate();
				cir.add(bp);
				Node from = g.getInputNode(0).from;
				from.connect(bp.getInputNode(0));

				Node n1 = bp.getOutputNode(0);
				this.outputs.add(n1);
				n1.setParent(this);
				n1.setID(count_out++);
				
				//g.delete();
			}
		}
	}
	
	public synchronized void simulate() {
		cir.simulate();
	}

	protected void drawShape(Graphics2D g) {
	}
}
