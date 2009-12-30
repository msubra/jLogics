/*
 * Created on Jul 21, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package test3;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 * @author Mahesh,Indu
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class Test1 extends JFrame implements ActionListener {

	public Test1() {
		Container c = this.getContentPane();

		c.setLayout(new GridLayout(2, 2));

		final JButton b1;
		String s = "\u0B85\u0B8E\u0BCD\u0B8E\u0BBE";
		s = "Ü‚è";

		c.add(b1 = new JButton(s));
		b1.setFont(new Font("Vikatan_TAM", Font.BOLD, 16));
		c.add(new JButton("text2"));
		c.add(new JRadioButton("text3"));

		c.add(new JLabel(s));

		b1.addActionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Test1();
	}

	public static void setUIFont(Font f) {
		Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();

			Object value = UIManager.get(key);
			if (value instanceof FontUIResource) {
				UIManager.put(key, f);
			}
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		try {
			setUIFont(new FontUIResource("Tahoma", Font.BOLD, 20));
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}