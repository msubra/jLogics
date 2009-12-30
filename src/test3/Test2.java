/*
 * Created on Jul 28, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package test3;

import gates.Gate;
import gui.MDIWindow;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import util.MessageBox;
import actions.FileOpenAction;

/**
 * @author Mahesh,Indu
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

public class Test2 extends JFrame {
	
	JButton add,remove;
	Container c;
	Box p2;
	
	Component selected = null;

	class ModuleItem extends JButton implements ActionListener{
		
		public ModuleItem(String text) {
			super(text);
			this.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e) {
			selected = (Component)e.getSource();
		}
		
	}
	
	public Test2() {
		c = this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(100,200);
		c.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(add = new JButton(new ImageIcon("images/add_green.png")));
		p1.add(remove = new JButton(new ImageIcon("images/remove_green.png")));
		
		c.add(p1,"North");
		p2 = Box.createVerticalBox();
		
		c.add(new JScrollPane(p2));
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileOpenAction open = new FileOpenAction(MDIWindow.currentWindow,"mod");
				Gate g = open.open();
				System.out.println(g.getClass());
				
				JButton b = new ModuleItem(g.getLabel() + ":" + g.getID()); 
				p2.add(b);
				Test2.this.validate();
			}
		});
		
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(selected == null) {
					MessageBox.showError("No Module selected");
					return;
				}
				
				int ret = JOptionPane.showConfirmDialog(Test2.this,"Do you want to remove the module from the list","Confirm?" , JOptionPane.YES_NO_OPTION);
				if(ret == JOptionPane.OK_OPTION) {
					p2.remove(selected);
					c.validate();
				}
			}
		});
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Test2();
	}
}
