/*
 * Created on Jan 23, 2005
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
public class TestClone1 implements Cloneable{
	String s;
	
	public void setValue(String s) {
		this.s = s;
	}
	
	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		TestClone1 t2 = null;
		TestClone1 t1 = new TestClone1();
		t1.setValue("a");
		System.out.println(t1);
		
		try {
			t2 = (TestClone1)t1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(t2);
		
		t1.setValue("b");
		System.out.println(t1);
		System.out.println(t2);
	}
}
