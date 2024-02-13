package lab5;

public class CocktailSort {

	public static void sort(Comparable[] intarray) {
		boolean sortedCheck = false;
		int last = intarray.length-1;
		int first = 0;
		/**i create a while loop to keep looping**/
		while(!sortedCheck) {
			//System.out.println("sort check");
			/**use for loop to go through list and switch values
			 * as needed**/
		for(int i = first; i<last;i++) {
			//System.out.println(intarray[i]+" "+ intarray[i+1]);
			if(intarray[i].compareTo(intarray[i+1])>0) {
				swich(intarray, i, i+1);
			}
		}
		for(int j = last; j>first; j--) {
			//System.out.println(intarray[j-1]+" "+  intarray[j]);
			if(intarray[j-1].compareTo(intarray[j])>0) {
				swich(intarray, j, j-1);
			}
		}
			
		/**minus last by 1 because the greatest numbers in the array
		 * are on the right**/
		last = last-1;
		/**add first by 1 because the lowest numbers in the array
		 * are on the left**/
		first = first+1;
		/**once your at the last place the whole array is sorted**/
		if(last==0) {
		sortedCheck = true;
			}
		}
	}
	
	private static void swich(Comparable[] ia, int i, int j) {
        Comparable swap = ia[i];
        ia[i] = ia[j];
        ia[j] = swap;
        //System.out.println("swich check");
    }
}

