package lists;

import java.util.Random;

public class ArrayVsLinkedListDemo {
	// method that I call in the main function
	public ArrayVsLinkedListDemo() {
		// variables i need to initialize
		long Starttime;
		long Endtime;
		long totaltime;
		long totaltime2;
		long totaltime3;
		long totaltime4;
		long totaltime5;
		long totaltime6;
		Random rand = new Random();
		int[] array = new int[500000];
		/** puts values into the array only used this for the test **/
		
//		for(int i = 0; i < array.length;i++) {
//			array[i] = rand.nextInt(10) + 0;
//			//System.out.println(array[i]);
//		}
		
/** creating the 2 objects i need */
		ArrayDS arrayTest = new ArrayDS(0);
		LinkedListDS<Integer> llTest = new LinkedListDS<>();
/** tested if it actaully worked **/		
//		for(int j = 0; j < array.length;j++) {
//			arrayTest.addFirst(array[j]);
//		}
//		
//		for(int z = 0; z < array.length;z++) {
//			arrayTest.addLast(array[z]);
//		}
//		
		//System.out.println(arrayTest.toString());
		/** measuring the time it takes for each method to add or get values 
		  measured the time it took a for loop to add or get values in the length 
		  of array or n**/
		Starttime = System.nanoTime();
		for(int k = 0; k < array.length; k++) {
			arrayTest.addLast(rand.nextInt(10)+0);
		}
		Endtime = System.nanoTime();
		totaltime = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		for(int k = 0; k < array.length; k++) {
			arrayTest.addFirst(rand.nextInt(10)+0);
		}
		Endtime = System.nanoTime();
		totaltime2 = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		for(int k = 0; k < array.length; k++) {
			arrayTest.getNth(rand.nextInt(10)+0);
		}
		Endtime = System.nanoTime();
		totaltime3 = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		for(int k = 0; k < array.length; k++) {
			llTest.addLast(rand.nextInt(10)+0);
		}
		Endtime = System.nanoTime();
		totaltime4 = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		for(int k = 0; k < array.length; k++) {
			llTest.addFirst(rand.nextInt(10)+0);
		}
		Endtime = System.nanoTime();
		totaltime5 = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		for(int k = 0; k < array.length; k++) {
			llTest.getNth(rand.nextInt(10)+0);
		}
		Endtime = System.nanoTime();
		totaltime6 = Endtime-Starttime;
		
		/** where I print the results **/
		System.out.println("addLast--Array: "+totaltime/1000+" Microseconds");
		System.out.println("addFirst--Array: "+totaltime2/1000+" Microseconds");
		System.out.println("getNth--Array: "+totaltime3/1000+" Microseconds");
		System.out.println("");
		System.out.println("addLast--LList: "+totaltime4/1000+" Microseconds");
		System.out.println("addFirst--LList: "+totaltime5/1000+" Microseconds");
		System.out.println("getNth--LList: "+totaltime6/1000+" Microseconds");
		System.out.println("");
		System.out.println("RESULTS");
		System.out.println("aArrayDS.addLast(): Exponential Time");
		System.out.println("aArrayDS.addFirst(): Exponenetial Time");
		System.out.println("aArrayDS.getNth(): Linear Time");
		System.out.println("------");
		System.out.println("LListDS.addLast():  Linear Time");
		System.out.println("LListDS.addFirst(): Linear Time");
		System.out.println("LListDS.getNth(): Linear Time");
		
	}
	/**main class that call ArrayVsLinkedListDemo()**/
	/**Also i was wondering of there was a better way to do this because
	 i feel like i did it a inefficient way, also i don't know if i got
	 growth rates right. when i was testing it at 10,100,1000,10000, and 100000
	 they for sure were not adding to zeros for every one i added **/
		public static void main(String[] args) {
			new ArrayVsLinkedListDemo();
		}
}
