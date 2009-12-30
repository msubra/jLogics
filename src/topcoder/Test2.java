/*
 * Created on Jan 23, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package topcoder;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Mahesh,Indu
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Test2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("src/topcoder/test1.rar");
		FileOutputStream fout = new FileOutputStream("src/topcoder/test2.txt");
		
		int x = -1;
		while((x = fin.read()) != -1) {
			fout.write(Integer.toBinaryString(x).getBytes());
		}
		fout.close();
		fin.close();
	}
}
