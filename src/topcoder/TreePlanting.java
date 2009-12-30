/*
 * Created on Jan 22, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package topcoder;

import java.math.BigInteger;
import java.util.TreeSet;

/**
 * @author Mahesh,Indu
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class TreePlanting {

	public long countArrangements(int total, int fancy) {
		if (fancy > total)
			return 0;

		int plain = total - fancy;
		String[] trees = new String[total];

		for (int i = 0; i < plain; i++) {
			trees[i] = "P";
		}
		for (int i = plain; i < total; i++) {
			trees[i] = "F";
		}

		int[] indices;
		Permutation x = new Permutation(trees.length);
		TreeSet dup = new TreeSet();
		int k = 0;


		while (x.hasMore()) {
			indices = x.getNext();
			boolean flag = false;
			for (int i = 0; i < indices.length - 1; i++) {
				String x1 = trees[indices[i]];
				String y1 = trees[indices[i + 1]];
				if(x1.equals("F") && y1.equals("F")) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				//dup.add(makeString(trees,indices));
				Integer[] in = new Integer[indices.length];
				for (int i = 0; i < indices.length; i++) {
					in[i] = new Integer(indices[i]);
				}
				dup.add(in);
			}
		}
		
		return k;
	}
	
	String makeString(String[] x, int[] y) {
		StringBuffer permutation = new StringBuffer();
		for (int i = 0; i < y.length; i++) {
			permutation.append(x[y[i]] + ",");
		}
		return permutation.toString();
	}

	public static void main(String[] args) {
		TreePlanting tp = new TreePlanting();
		System.out.println(tp.countArrangements(10,4));
	}
}

class Permutation {

	private int[] a;
	private BigInteger numLeft;
	private BigInteger total;

	public Permutation(int n) {
		a = new int[n];
		total = getFactorial(n);
		reset();
	}

	public void reset() {
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		numLeft = new BigInteger(total.toString());
	}

	public boolean hasMore() {
		return numLeft.compareTo(BigInteger.ZERO) == 1;
	}

	private static BigInteger getFactorial(int n) {
		BigInteger fact = BigInteger.ONE;
		for (int i = n; i > 1; i--) {
			fact = fact.multiply(new BigInteger(Integer.toString(i)));
		}
		return fact;
	}

	public int[] getNext() {

		if (numLeft.equals(total)) {
			numLeft = numLeft.subtract(BigInteger.ONE);
			return a;
		}

		int temp;

		// Find largest index j with a[j] < a[j+1]

		int j = a.length - 2;
		while (a[j] > a[j + 1]) {
			j--;
		}

		// Find index k such that a[k] is smallest integer
		// greater than a[j] to the right of a[j]

		int k = a.length - 1;
		while (a[j] > a[k]) {
			k--;
		}

		// Interchange a[j] and a[k]

		temp = a[k];
		a[k] = a[j];
		a[j] = temp;

		// Put tail end of permutation after jth position in increasing order

		int r = a.length - 1;
		int s = j + 1;

		while (r > s) {
			temp = a[s];
			a[s] = a[r];
			a[r] = temp;
			r--;
			s++;
		}

		numLeft = numLeft.subtract(BigInteger.ONE);
		return a;
	}
}