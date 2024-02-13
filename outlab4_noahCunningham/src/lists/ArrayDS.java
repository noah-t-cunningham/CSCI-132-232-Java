package lists;

public class ArrayDS {
	/** initialize variables **/
	private int enter;
	private int[] array;
	private int[] array2;
	/**constructor that lets me set the capacity of the arrays**/
	public ArrayDS(int capacity) {
		array = new int[capacity];
	}
	/** makes a new array that is 1 unit longer than the original one.
	  Then adds the int e to the first index of the new array. Then sets
	  every value of the original array to the new array but shifted
	  1 to the right. Then sets the new array equal to the original one.**/
	public void addFirst(int e) {
		array2 = new int[array.length+1];
		array2[0] = e;
		for(int i = 1; i < array2.length; i++) {
			array2[i] = array[i-1];
		}
		array = array2;
		
	}
	/** makes a new array that is 1 unit longer than the original one.
	  Then adds the int e to the last index of the new array. Then sets
	  every value of the original array to its original place in the
	  new array. Then sets the new array equal to the original one. **/
	public void addLast(int e) {
		array2 = new int[array.length+1];
		array2[array2.length-1] = e;
		for(int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		array = array2;
		
	}
	/**gets a value at n place**/
	public int getNth(int n) {
		return array[n];
	}
	
	/**string builder for testing if it works**/
	public String toString(){
		StringBuilder sb = new StringBuilder("(");
			for(int i = 0; i < array.length ;i++) {
				sb.append(array[i] + ", ");
		}
		sb.append(")");
		return sb.toString();
	}
}
