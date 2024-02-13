package outlab6_noahCunningham;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>{
	/**method compare that takes 2 arguments**/
	public int compare(String a, String b) {
		/**returns various values if the the strings are equal length or one
		 * is greater than the other**/
		if(a.length()< b.length()) {
		return -1;
		}
		else if(a.length() == b.length()) {
		return 0;
		}
		else
		return 1;		
	}
}
