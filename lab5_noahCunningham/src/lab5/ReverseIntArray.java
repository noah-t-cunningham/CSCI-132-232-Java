package lab5;

import java.util.Arrays;

/** 
 * Lab 5
 * Given a method that reverses the int elements in an array, 
 * modify it so that it is generic and reverses elements of any type array.
 * When it is finished, rename it to ReverseGenericArray.java
 * 
 * Make each array contain at least 5 elements.
 * Song is a class you will write. It should contain fields for title and artist, 
 * as well as a 'toString' method to override Arrays.toString
 * 
 * Test it with Integer, String, and Song arrays.
 *
 */

/**
 * TODO: make this generic 
 * (BIG Hint: see page 95 of book!)
 *
 */

public class ReverseIntArray {
	public static <T> void reverse(T[] data) {
		int low = 0, high = data.length - 1;
		while (low < high) { 			// swap data[low] and data[high]
			T temp = data[low];
			data[low++] = data[high]; 	// post-increment of low
			data[high--] = temp; 		// post-decrement of high
		}
	}

	
	public static void main(String[] args) {
		
		// test with an array of strings (done)
		Integer[] myInts = new Integer[8];
		for (int i = 0; i < myInts.length; i++) {
			myInts[i] = (i + 1) * 2;
		}
		// Using the Arrays API to print the string
		System.out.println(Arrays.toString(myInts));
		
		ReverseIntArray.reverse(myInts);
		System.out.println(Arrays.toString(myInts));
		
		
		/**
		 *  test with an array of Strings...
		 */
		// test with an array of strings (done)
				String[] myStrings = new String[8];
				
					myStrings[0] = "are";
					myStrings[1] = "you";
					myStrings[2] = "as";
					myStrings[3] = "backwards";
					myStrings[4] = "as";
					myStrings[5] = "I";
					myStrings[6] = "am";
					myStrings[7] = "buddy";
	
				// Using the Arrays API to print the string
				System.out.println(Arrays.toString(myStrings));
				
				ReverseIntArray.reverse(myStrings);
				System.out.println(Arrays.toString(myStrings));
		
		/**
		 *  test with an array of Songs...
		 *  You must write the Song class -- see above.
		 */
				
				Song[] mySongs = new Song[8];
				
				mySongs[0] = new Song("Ecstacy of Gold","Ennio Morricone");
				mySongs[1] = new Song("Pancho and Lefty","Townes Van Zandt");
				mySongs[2] = new Song("Bob Wills is Still the King","Waylon Jennings");
				mySongs[3] = new Song("Guess Things Happen That Way","Johnny Cash");
				mySongs[4] = new Song("Big Iron","Marty Robins");
				mySongs[5] = new Song("Your Cheating Heart","Hank Williams");
				mySongs[6] = new Song("On the Road Again","Willie Nelson");
				mySongs[7] = new Song("Ringo","Lorne Greene");

			// Using the Arrays API to print the string
			System.out.println(Arrays.toString(mySongs));
			
			ReverseIntArray.reverse(mySongs);
			System.out.println(Arrays.toString(mySongs));
		
	}
}
	