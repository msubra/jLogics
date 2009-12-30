/*
 * Created on Jan 22, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package topcoder;

/**
 * @author Mahesh,Indu
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class StringCompare {
	
	public int simpleDifference(String a, String b) {
		int len = a.length() <= b.length() ? a.length() : b.length();
		int count = 0;
		for(int i = 0; i < len; i++) {
			if(a.charAt(i) == b.charAt(i)) {
				count++;
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		StringCompare st = new StringCompare();
		
		System.out.println(st.simpleDifference("ANTIDISESTABLISHMENTARIANISM","FLOCCIPAUCINIHILIPIFICATION"));
	}
}
