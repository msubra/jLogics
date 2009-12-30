/*
 * Created on May 20, 2004
 */
package treeviewer;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author maheshexp
 */
public class Parser {
	String tok;
	StringTokenizer st;
	ExpressionNode root;
	ArrayList items = new ArrayList();
	ArrayList levels = new ArrayList();
	static int index = 0;
	public static final int SIZE = 80;

	public void eval(String expr) {
		st = new StringTokenizer(expr, "()*+-/", true);
		expression();
	}

	public ExpressionNode expression() {
		token();
		root = term();
		return root;
	}

	ExpressionNode term() {
		ExpressionNode exp = factor();

		while (tok != null && (tok.equals("+") || tok.equals("-"))) {
			String tok1 = tok;
			token();
			ExpressionNode nextTerm = factor();
			exp = new ExpressionNode(tok1, exp, nextTerm);
		}
		return exp;
	}

	ExpressionNode factor() {
		ExpressionNode term = id();

		while (tok != null && (tok.equals("*") || tok.equals("/"))) {
			String tok1 = tok;
			token();
			ExpressionNode nextFactor = id();
			term = new ExpressionNode(tok1, term, nextFactor);
		}

		return term;
	}

	ExpressionNode id() {
		ExpressionNode n = null;
		if (tok.equals("(")) {
			n = expression();
		} else {
			n = new ExpressionNode(tok, null, null);
		}

		//		if (items.contains(n)) {
		//			/* item already exist , get the existing and don't add newly */
		//			n = (ExpressionNode) items.get(items.indexOf(n));
		//			//n = null;
		//		} else {
		//			items.add(n);
		//			n.id = "P" + index++;
		//		}

		token();
		return n;
	}

	public void print() {
		int length1 = levels.size();
		int space = SIZE;

		for (int i = 0; i < length1; i++) {
			ArrayList nodes = (ArrayList) levels.get(i);
			int length2 = nodes.size();
			space = space / 2;
			for (int j = 0; j < length2; j++) {
				//print spaces
				for (int k = 0; k < (j + 1) * (space - 1); k++) {
					System.out.print(' ');
				}
				//print data
				System.out.print(nodes.get(j));
			}
			System.out.println();
			System.out.println();
		}
	}

	void token() {
		tok = st.hasMoreElements() ? st.nextToken() : null;
	}

	//	private void travel(ExpressionNode n, int level) {
	//		if (n != null) {
	//			ArrayList nodes;
	//			if (levels.size() > level)
	//				nodes = (ArrayList) levels.get(level);
	//			else {
	//				nodes = new ArrayList();
	//				levels.add(level, nodes);
	//			}
	//			nodes.add(n.getData());
	//			travel(n.left, level + 1);
	//			travel(n.right, level + 1);
	//
	//		}
	//	}

	//	public void travel() {
	//		travel(root, 0);
	//	}
}