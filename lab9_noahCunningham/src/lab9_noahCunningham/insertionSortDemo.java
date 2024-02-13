package lab9_noahCunningham;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class insertionSortDemo {
	
	
	
	public insertionSortDemo(int n){
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int array[]= new int[n];
		for(int i = 0; i<array.length; i ++) {
			array[i] = rand.nextInt(100) + 0;
		}
		System.out.println(Arrays.toString(array));
		boolean bool = true;
	
		do {
			System.out.println("1. Sort Ascending");
			System.out.println("2. Sort Descending");
			System.out.println("3. Quit");
			while(!input.hasNextInt()) {
				input.next();
				System.out.println("Enter a Number");
			}
			int choice = input.nextInt();
			
			switch(choice) {
			case 1:
				int [] array2 = insertionSort.sortAscending(array);
				System.out.println();
				System.out.println(Arrays.toString(array2));
				System.out.println();
				break;
			case 2:
				int [] array3 = insertionSort.sortDescending(array);
				System.out.println();
				System.out.println(Arrays.toString(array3));
				System.out.println();
				break;
			
			case 3:
				bool = false;
				break;
				
			default:
				System.out.println("Enter 1, 2 or 3");
			}	
		}while(bool);
		

		
	
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("How big will your array be?");
		
		while(!input.hasNextInt()) {
			input.next();
			System.out.println("Enter a Number");
		}
		int n = input.nextInt();
		n = Math.abs(n);
		new insertionSortDemo(n);
	}
}
