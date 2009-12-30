/*
 * Created on Jan 22, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package topcoder;

import java.util.Arrays;
import java.util.Vector;

/**
 * @author Mahesh,Indu
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */

class Name implements Comparable {
	private String lastName;
	private String firstName;
	public Name(String first, String last) {
		firstName = first;
		lastName = last;
	}
	public int compareTo(Object o) {
		// This automatically throws exception if wrong type
		Name other = (Name) o;
		int returnValue = lastName.compareTo(other.lastName);
		if (returnValue == 0) {
			returnValue = firstName.compareTo(other.firstName);
		}
		return returnValue;
	}

	public String toString() {
		return firstName + " " + lastName;
	}
}

public class ClientsList {
	
	public String[] dataCleanup(String[] names) {
		Vector v = new Vector();
		String firstname = "", lastname = "";
		
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			
			int index = name.indexOf(',');
			if (index > 1) {//last,first format
				lastname = name.substring(0, index);
				firstname = name.substring(index + 1);
			}
			else if(name.indexOf(" ") > -1){
				index = name.indexOf(" ");
				firstname = name.substring(0, index);
				lastname = name.substring(index + 1);
			}
			
			firstname = firstname.trim();
			lastname = lastname.trim();
			
			/* check for cases */
			lastname = lastname.toLowerCase();
			firstname = firstname.toLowerCase();

			char[] change = lastname.toCharArray();
			change[0] = Character.toUpperCase(change[0]);
			lastname = new String(change);

			change = firstname.toCharArray();
			change[0] = Character.toUpperCase(change[0]);
			firstname = new String(change);
			
			v.add(new Name(firstname,lastname));
		}

		Object[] ar = v.toArray();
		
		Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {
			names[i] = ar[i].toString();
		}
		return names;
	}

	public static void main(String[] args) {
		ClientsList ct = new ClientsList();
		String[] data = {"Campbell, Phil", "John Campbell", "Young, Warren"};
		String[] test = ct.dataCleanup(data);
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		
		
	}
}