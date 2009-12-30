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
public class Test1 {

	public static void main(String[] args) {
		
		if(4 < 2 * 2)
			System.out.println(0);
		else {
			System.out.println(1);
		}
		
	}
	
	public static int combinations(int n, int p){
	    int[] pascals=new int[n+1];
	    pascals[0]=1;
	    for(int i=0; i < n; ++i){
	        pascals[i+1]=1;
	        for(int j=i; j > 0; --j){
	            pascals[j] += pascals[j-1];
	        }
	    }
	    return pascals[p];
	}

}
