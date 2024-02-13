package Week2;

import java.util.Scanner;

public class arraydemo {
	public static void main(String[] args) {
	String[] myGrocries = {"apples", "milk", "eggs", "chicken", "peppers"};
	int[] myNumber = new int[10];
	//System.out.println(myGrocries[1]);
	
	
	for (int i = 0; i < myGrocries.length - 1; i++) {
		System.out.print(myGrocries[i] + ", ");	
	}
		System.out.print(myGrocries[4]);
		
		
		double[][] m = new double[6][4];
		for (int r = 0; r < 6; r++) {
			System.out.println();
			for (int c = 0; c < 4; c++) {
				m[r][c]= 1+r+c;
				System.out.print(m[r][c] + "\t");
			}
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int size = scan.nextInt();
		int[] myInts = new int[size];
		for (int z = 0; z < size; z++) {
			myInts[z] = z+1;
		}
		
		for (int x = 0; x < myInts.length; x++) {
			
		}
		
		scan.close();
		
 	}
}
