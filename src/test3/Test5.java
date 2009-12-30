/*
 * Created on Feb 12, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package test3;

import parser.PostfixExpression;

/**
 * @author Mahesh,Indu
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Test5 {

	public static void main(String[] args) {
		PostfixExpression expr = new PostfixExpression();
		System.out.println(expr.toPostFix("a+(b*c)"));
	}
}
