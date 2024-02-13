package outlab6_noahCunningham;

import java.util.Comparator;

public class quickSort {
	/** make static method so it can call itself easily **/
	public static <K> void QS (String[] S, StringLengthComparator comp, int a, int b) {
		/** keeps the index form being -1**/
		if(a>= b) return;
		
		/** makes variables i need**/
		int left = a;
		int right = b-1;
		String pivot = S[b];
		String temp; 
		/** **/
		while(left <= right) {
			/**increments left by one until reaching value smaller or equal to pivot **/
			while(left<= right && comp.compare(S[left], pivot) > 0) {
				left++;
			}
			/**decrements right by one until reaching value greater or equal to pivot **/
			while(left<= right && comp.compare(S[right], pivot) < 0) {
				right--;
			}
			/** swaps s left and s right because s left is bigger than s left**/
			if(left<=right) {
				temp = S[left];
				S[left] = S[right];
				S[right] = temp;
				left++;
				right--;
			}
		}
		/** swaps s left with pivot because s left is bigger than pivot**/
		temp = S[left];
		S[left] = S[b];
		S[b] = temp;
		/**calls function again but makes the pivot one less than left**/
		QS(S,comp, a, left-1);
		/**calls function again but makes the left value shift plus one**/
		QS(S,comp, left+1, b);
		/** more explanation: quick sort works in the way that you compare variables to
		 * the pivot and if a variable is bigger than the pivot and a variable is smaller
		 * than the pivot swap those to variables. So it sorts the list in relations to pivot,
		 * after one "lap" the right half is smaller than pivot and the left half is greater
		 * than pivot, this means we have sorted pivot and know it location. Does this until
		 * list is sorted**/ 
	 }
}
