package outlab1;

import java.lang.reflect.Array;

public class BubbleSort {
	
	

	public static void sort(int[] intarray) {
		boolean sortedCheck = false;
		int last = intarray.length-1;
		/**i create a while loop to keep looping**/
		while(!sortedCheck) {
			//System.out.println("sort check");
			/**use for loop to go through list and switch values
			 * as needed**/
		for(int i = 0; i<last;i++) {
			if(intarray[i+1]<intarray[i]) {
				swich(intarray, i, i+1);
				}
			}
		/**minus last by 1 because the greatest numbers in the array
		 * are on the right**/
		last = last-1;
		/**once your at the last place the whole array is sorted**/
		if(last==0) {
		sortedCheck = true;
			}
		}
	}
	
    private static void swich(int[] ia, int i, int j) {
        int swap = ia[i];
        ia[i] = ia[j];
        ia[j] = swap;
        //System.out.println("swich check");
    }
	
//	public static boolean sorted(int[] ia) {
//		for (int i = 0 + 1; i < ia.length-1; i++) {
//			if (ia[i] > ia[i-1]) {
//				//System.out.println("sorted check");
//				return false;
//			}
//		}
//		return true;
//	}
	
}
