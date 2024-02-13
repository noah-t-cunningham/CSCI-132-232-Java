package slotMech;

// import scanner
import java.util.Scanner;

public class slotMachineDemo {
	public static void main(String[] args) {
		
		//create scanner 
		Scanner input = new Scanner(System.in);
		
		//initialize bet variable
		int bet = 0;
		
		
		System.out.println("Welcome to GetRichQuick Slots");
		System.out.println("You have $100 to Start");
		System.out.println("Enter -1 to cash Out");
		System.out.println("Good Luck");
		
		System.out.println("How much $ do you want to bet?");
		// while loop that asks you to enter an integer when you enter a string or float
		while(!input.hasNextInt()) {
			input.next();
			System.out.println("Enter a Integer.");
		}
		// sets bet to your input
		bet = input.nextInt();
		// creates an object called sM with the slotMachine class
		slotMachine sM = new slotMachine();
		
		
		// while loop that always runs unless bet = -1
		while(bet != -1){	
		sM.pullTheLever(bet);
		sM.printSlot();
		sM.printPhrase();
		System.out.println("How much $ do you want to bet?");
		// while loop that asks you to enter an integer when you enter a string or float
		while(!input.hasNextInt()) {
			input.next();
			System.out.println("Enter a Integer.");
			}
		// sets bet to your input
		bet = input.nextInt();
		
		}	
		
		// if your bet is -1 you cash out and i have a for loop that simulated 1,000,000
		// more games
		if(bet == -1) {
			sM.printFinalPhrase();
			System.out.println("After 1,000,000 more games:");
			for(int i=0; i < 1000000; i++) {
				sM.pullTheLever(1);
				//System.out.println("Hi");
				if(i == 999999) {
				sM.printSlot();
				sM.printPhrase();
				}
				
			}
		}
		
	}
}
