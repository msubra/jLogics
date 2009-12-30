/*
 * Created on May 20, 2004
 */
package treeviewer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Vector;

import javax.swing.JPanel;

/**
 * @author maheshexp
 */
public class TreePanel extends JPanel {
	Vector items = new Vector();

	public void move(ExpressionNode n, int level, ExpressionNode root) {
		if (n != null) {
			if (n == root) {
				items.clear();
				n.setLocation(this.getWidth() / 2, 10);
			}
			items.add(n);
			locate(n, level + 1);
			move(n.left, level++, root);
			move(n.right, level++, root);
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int height = this.getHeight();
		int width = this.getWidth();

		Graphics2D g1 = (Graphics2D) g;
		int xs = (int) (Math.cos(Math.toRadians(120)) * 200 + width / 3);
		int ys = (int) (Math.sin(Math.toRadians(120)) * 200 + height / 3);

		g.drawLine(width / 3, height / 3, xs, ys);

		g.setColor(Color.RED);
		//xs = (int) (Math.cos(Math.toRadians(30)) * 100 + width);
		//ys = (int) (Math.sin(Math.toRadians(30)) * 100 + height);

		//g.drawLine(width / 2,height / 2,xs,ys);

		//		for (int i = 0; i < items.size(); i++) {
		//			Graphics2D g1 = (Graphics2D) g;
		//			ExpressionNode n = (ExpressionNode) items.get(i);
		//			g1.drawString(n.getData(), n.x + n.width / 2, n.y + n.height / 2);
		//			g1.draw(n);
		//			line(n, g);
		//		}
	}

	private void line(ExpressionNode n, Graphics g) {
		g.setColor(Color.BLUE);
		if (n != null && n.left != null) {
			g.drawLine(n.x, n.y + n.height, n.left.x, n.left.y);
		}
		if (n != null && n.right != null) {
			g.drawLine(n.x, n.y + n.height, n.right.x, n.right.y);
		}
		g.setColor(Color.BLACK);
	}

	private void locate(ExpressionNode n, int level) {
		if (n != null) {
			int x = (int) n.getX();
			int y = (int) n.getY();

			if (n.left != null)
				n.left.setLocation(x - 200 / level, y + 30);

			if (n.right != null)
				n.right.setLocation(x + 200 / level, y + 30);
		}
	}
}