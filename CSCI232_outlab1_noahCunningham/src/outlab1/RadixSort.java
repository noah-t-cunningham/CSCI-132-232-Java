package outlab1;

public class RadixSort {
	public static void sort(int[] array){
		//need max elements to now how many passes i need to make
		int max = max(array);
		// for loop that increments by 10 because their is 1s place, 10s place
		//100s place... and so forth. So if you have 647 as the max it will
		//be above 0 for 3 passes and there are 3 digits in 647
		for(int p=1;max/p>0;p*=10) {
		//call a separate method that looks at each individual digits and sorts
		//	them
			countingSort(array, p);
		}
	}
	public static void countingSort(int[] array, int p) {
		//create varaibles i need
		int l = array.length;
		int[] sorted = new int[l];
		int[] countIndex= new int[10];
		//for loop that makes the counter list all 0 at the start
		for(int i=0;i<countIndex.length;i++) {
			countIndex[i]=0;
		}
		//for loop that incremnts count index, if the 1s place digit is
		// 5 it adds 1 to the 5th index in countindex list
		for(int j=0;j<l;j++) {
			//%10 is there to get the digit, ex 647/1=647, 647 % 10 = 7
			++countIndex[(array[j]/p)%10];
		}
		//adss each number in countIndex consecutively to reflect
		// starting index of each nuber
		for(int z=1;z<countIndex.length;z++) {
			countIndex[z]+=countIndex[z-1];
		}
		//sorts the numbers by whatever digits place we are on
		for (int s = l-1; s>=0; s--) { 
			//647 on the first pass would be 7, stores 647 in
			//sorted[--countIndex[7]] place
			sorted[--countIndex[(array[s]/p)%10]] = array[s];
			
        }
		//copy sorted array over to the first array
        for (int q = 0; q<l; ++q) 
            array[q] = sorted[q];
	}
	//function to get max element in array
	public static int max(int[] array) {
		int max=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max){
				max=array[i];
			}
		}
		//System.out.println(max);
		return max;
	}
}
