/*
 * Created on Feb 12, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package test3;

/**
 * @author Mahesh,Indu
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */

/*
 * LICENSE NOTES: The original version of this source code written by David Eck,
 * 8 October 1998. I have made some minor enhancements. As with the original,
 * this code is distributed with no restrictions or warranty. Do whatever you
 * want with it and take full responsibility for the results.
 * 
 * Since I got my hands on it I've: Added a 3rd variable. Added "round()"
 * funtion Fixed deprecation errors.
 */

final class MathExpression {

	//----------------- public interface
	// ---------------------------------------

	public MathExpression(String definition) {
		// Construct an expression, given its definition as a string.
		// This will throw an IllegalArgumentException if the string
		// does not contain a legal expression.
		parse(definition);
	}

	public String getDefinition() {
		// Return the original definition string of this expression. This
		// is the same string that was provided in the constructor.
		return definition;
	}

	//------------------- private implementation details
	// ----------------------------------

	private String definition; // The original definition of the expression,
	// as passed to the constructor.

	private byte[] code; // A translated version of the expression, containing
	//   stack operations that compute the value of the expression.

	private double[] stack; // A stack to be used during the evaluation of the
	// expression.

	private double[] constants; // An array containing all the constants found
	// in the expression.

	private static final byte // values for code array; values >= 0 are indices
			// into constants array
			PLUS = -1, MINUS = -2, TIMES = -3, DIVIDE = -4, POWER = -5,
			UNARYMINUS = -22, VARIABLE = -23, CONSTANT = -24;

	private int pos = 0, constantCt = 0, codeSize = 0; // data for use during
	// parsing

	private void error(String message) { // called when an error occurs during
		// parsing
		throw new IllegalArgumentException("Parse error:  " + message
				+ "  (Position in data = " + pos + ".)");
	}

	private int computeStackUsage() { // call after code[] is computed
		int s = 0; // stack size after each operation
		int max = 0; // maximum stack size seen
		for (int i = 0; i < codeSize; i++) {
			if (code[i] >= 0 || code[i] == VARIABLE || code[i] == CONSTANT) {
				s++;
				if (s > max)
					max = s;
			} else if (code[i] >= POWER)
				s--;
		}
		return max;
	}

	private void parse(String definition) { // Parse the definition and produce
		// all
		// the data that represents the expression
		// internally; can throw IllegalArgumentException
		if (definition == null || definition.trim().equals(""))
			error("No data provided to Expr constructor");
		this.definition = definition;
		code = new byte[definition.length()];
		constants = new double[definition.length()];
		parseExpression();
		
		skip();
		if (next() != 0)
			error("Extra data found after the end of the expression.");
		int stackSize = computeStackUsage();
		stack = new double[stackSize];
		byte[] c = new byte[codeSize];
		System.arraycopy(code, 0, c, 0, codeSize);
		code = c;
		double[] A = new double[constantCt];
		System.arraycopy(constants, 0, A, 0, constantCt);
		constants = A;
	}

	private char next() { // return next char in data or 0 if data is all used
		// up
		if (pos >= definition.length())
			return 0;
		else
			return definition.charAt(pos);
	}

	private void skip() { // skip over white space in data
		while (Character.isWhitespace(next()))
			pos++;
	}

	// remaining routines do a standard recursive parse of the expression

	private void parseExpression() {
		boolean neg = false;
		skip();
		
		if (next() == '+' || next() == '-') {
			neg = (next() == '-');
			pos++;
			skip();
		}
		
		if (neg)
			code[codeSize++] = UNARYMINUS;
		
		skip();
		while (next() == '+' || next() == '-' || next() == '*' || next() == '/' || next() == '^') {
			char op = next();
			pos++;
			if (op == '+')
				code[codeSize++] = PLUS;
			if (op == '-')
				code[codeSize++] = MINUS;
			if (op == '*')
				code[codeSize++] = TIMES;
			if (op == '/')
				code[codeSize++] = DIVIDE;
			else
				code[codeSize++] = POWER;
			skip();
		}
	}

	private void parsePrimary() {
		skip();
		char ch = next();

		if (Character.isLetter(ch)) {
			pos++;
			code[codeSize++] = VARIABLE;
		} else if (ch == '1' || ch == '0') {
			pos++;
			code[codeSize++] = CONSTANT;
		} else if (ch == '(') {
			pos++;
			parseExpression();
			skip();
			if (next() != ')')
				error("Exprected a right parenthesis.");
			pos++;
		} else if (ch == ')')
			error("Unmatched right parenthesis.");
		else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^')
			error("Operator '" + ch + "' found in an unexpected position.");
		else if (ch == 0)
			error("Unexpected end of data in the middle of an expression.");
		else
			error("Illegal character '" + ch + "' found in data.");
	}

	private void parseWord() {
		String w = "";
		while (Character.isLetterOrDigit(next())) {
			w += next();
			pos++;
		}
		w = w.toLowerCase();
		error("Unknown word '" + w + "' found in data.");
	}

	private void parseNumber() {
		String w = "";
		while (Character.isDigit(next())) {
			w += next();
			pos++;
		}
		if (next() == '.') {
			w += next();
			pos++;
			while (Character.isDigit(next())) {
				w += next();
				pos++;
			}
		}
		if (w.equals("."))
			error("Illegal number found, consisting of decimal point only.");
		if (next() == 'E' || next() == 'e') {
			w += next();
			pos++;
			if (next() == '+' || next() == '-') {
				w += next();
				pos++;
			}
			if (!Character.isDigit(next()))
				error("Illegal number found, with no digits in its exponent.");
			while (Character.isDigit(next())) {
				w += next();
				pos++;
			}
		}
		double d = Double.NaN;
		try {
			d = Double.valueOf(w).doubleValue();
		} catch (Exception e) {
		}
		if (Double.isNaN(d))
			error("Illegal number '" + w + "' found in data.");
		code[codeSize++] = (byte) constantCt;
		constants[constantCt++] = d;
	}

}

public class Test3 {

	public static void main(String[] args) {
		MathExpression t = new MathExpression("a+b+1");
		System.out.println(t.getDefinition());
	}
}