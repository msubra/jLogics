/*
 * Created on Jul 28, 2004
 * 
 * TODO To change the template for this generated file go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
package test3;

import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.beans.EventHandler;

import javax.swing.JFrame;

public class MouseHandler extends JFrame {
	public MouseHandler() {
		super("Press and Release Mouse");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.addMouseListener((MouseListener) EventHandler.create(
				MouseListener.class, this, "pressed", "point", "mousePressed"));
		contentPane.addMouseListener((MouseListener) EventHandler
				.create(MouseListener.class, this, "released", "point",
						"mouseReleased"));
		contentPane.addMouseMotionListener((MouseMotionListener) EventHandler
				.create(MouseMotionListener.class, this, "released", "point",
						"mouseMoved"));
		
	}
	
	public void pressed(Point p) {
		System.out.println("Pressed at: " + p);
	}
	public void released(Point p) {
		System.out.println("Released at: " + p);
	}
	
	public static void main(String args[]) {
		JFrame frame = new MouseHandler();
		frame.setSize(400, 400);
		frame.show();
	}
}