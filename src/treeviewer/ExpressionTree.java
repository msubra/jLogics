package treeviewer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class TreeWindow extends JFrame {

	public TreeWindow() {
		super("Tree Viewer");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final TreePanel panel = new TreePanel();
		panel.setLayout(null);

		JPanel panel1 = new JPanel(new BorderLayout());
		final JTextField text = new JTextField("(a+b)*(c+d)+(e*f)");
		JButton view = new JButton("view");
		view.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parser t = new Parser();
				t.eval(text.getText());
				panel.move(t.root, 1, t.root);
				panel.repaint();
			}
		});

		panel1.add(view, "East");
		panel1.add(text, "Center");

		this.getContentPane().add(panel);
		this.getContentPane().add(panel1, "South");
		this.validate();
		this.setVisible(true);
	}

}

public class ExpressionTree {

	public static void main(String[] args) {
		new TreeWindow();
	}
}