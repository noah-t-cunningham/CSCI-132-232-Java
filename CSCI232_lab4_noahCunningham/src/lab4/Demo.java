package lab4;

import java.util.Arrays;

public class Demo {
public static void main(String[] args) {
	/** create arrays **/
	Integer[] Tarray = {16,5,11,2,1,15,8,14,7,12,3,9,4,6,13,10};
	Integer[] array1 = new Integer[100000];
	//generate random numbers for array
	for(int i = 0; i<array1.length; i++){
		array1[i]=StdRandom.uniform(100000);
		}
	// create a copy of array1
	Integer[] array2 = Arrays.copyOf(array1, 100000);
	// sort and time them
	Stopwatch SW1 = new Stopwatch();
	MergeSort.sort(array1);	
	System.out.println("MergeSort Elapsed Time: "+SW1.elapsedTime());
	
	Stopwatch SW2 = new Stopwatch();
	QuickSort.sort(array2);	
	System.out.println("QuickSort Elapsed Time: "+SW2.elapsedTime());
	}

}
