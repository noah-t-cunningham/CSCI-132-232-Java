package lab8_noahCunningham;

import java.util.Arrays;
import java.util.Random;

public class arrayRecursion {
	static Random rand = new Random();
	static int checks;
	static int checks2;
	
	public static int[] arrayRecursion1(int n) {
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = rand.nextInt(n) + 1;
			//System.out.println(array[i]);
		}
		return array;
	}
	
	public static int binarySearch(int[] array, int target, int low, int high) {
		if(low>high) {
			return -1;
		}
		else {
			int mid = (low+high)/2;
			if(target==array[mid]) {
				return mid;
			}
			else if(target<array[mid]) {
				checks += 1;
				return binarySearch(array,target,low, mid -1);
			}
			else {
				checks += 1;
				return binarySearch(array,target,mid+1, high);
			}
		}
	}
	
	public static int linearSearch(int[] array, int target, int size) {
		if(array[size]==target) {
			return size;
		}
		else if(size == 0) {
			return -1;
		}
		else {
			checks2 += 1;
			return linearSearch(array, target, size-1);
		}
	}
	
	public static void main(String[] args) {
		int n = 10000;
		int target = 998;
		int[] array = arrayRecursion1(n);
		Arrays.sort(array);
		int BS = binarySearch(array, target, 0, n-1);
		System.out.println("***Binary Search***");
		System.out.println("Target: "+ target + " at index "+ BS);
		System.out.println("binarySearch took "+checks+ " method calls for input size "+ n);
		int LS = linearSearch(array, target, array.length-1);
		System.out.println("***Linear Search***");
		System.out.println("Target: "+ target +  " at index "+ LS);
		System.out.println("linearSearch took "+checks2+ " method calls for input size "+ n);
	}
}
