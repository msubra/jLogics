/*
 * Created on May 20, 2004
 */
package treeviewer;

import java.awt.Rectangle;
import java.util.Vector;

/**
 * @author maheshexp
 */
public class ExpressionNode extends Rectangle {
	ExpressionNode left, right;
	String data, id = "";
	static Vector set = new Vector();
	boolean connected = false;

	public ExpressionNode(String data, ExpressionNode left, ExpressionNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
		height = width = 20;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();

		if (data != null) {
			buf.append("(");
			buf.append(data);

			if (left != null) {
				buf.append(",");
				buf.append(left);
			}

			if (right != null) {
				buf.append(",");
				buf.append(right);
			}

			buf.append(")");
			if (!id.equals(""))
				buf.append(":" + id);
		}

		return buf.toString();
	}

	public String getData() {
		return data;
	}

	public boolean equals(Object obj) {
		ExpressionNode n1 = (ExpressionNode) obj;

		if (n1 == null)
			return false;

		boolean flag = n1.data.equals(this.data);

		if (n1.left != null)
			flag = flag && n1.left.equals(this.left);

		if (n1.right != null)
			flag = flag && n1.right.equals(this.right);

		return flag;
	}

	public void setConnected(boolean visited) {
		this.connected = visited;
	}

	public boolean isConnected() {
		return connected == true;
	}

}