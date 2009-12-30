/*
 * Created on May 17, 2004
 */
package test1;

import java.awt.Color;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * @author maheshexp
 */

class Panel1 extends JPanel {
	int x = 10, y = 10;
	public Panel1() {
		super();
		this.setBackground(Color.YELLOW);

		init();
	}

	private void init() {
		this.setLayout(null);
		for (int i = 0; i < 15; i++) {
			JButton button = new JButton("Button:" + i);
			button.setSize(100, 100);
			button.setLocation(0, 100 * i);
			this.add(button);
		}
	}
}

class DragWindow extends JFrame {
	Panel1 panel;
	public DragWindow() {
		super("Drag");
		this.setSize(100, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollPane sc = new JScrollPane(panel = new Panel1());
		this.getContentPane().add(sc);
		this.validate();
		this.setVisible(true);
	}
}

public class Test1 {

	public static void main(String[] args) {
		//new DragWindow();
		Vector rem2 = new Vector();
		String str = new String("hello");
		for (int i = 0; i < str.length(); i++) {
			rem2.addElement(new Character(str.charAt(i)));
		}
		System.out.println(rem2);
	}
}