package slotMech;

import java.util.Random;
// class for the slotMachine
public class slotMachine {
		// initialize the various variables i need
	    Random rand = new Random();
		int won = 0;
		int denero = 100;
		int betting = 0;
		int reelOne = 0;
		int reelTwo = 0;
		int reelThree = 0;
		// method that simulates pulling the slot machine lever 
		public void pullTheLever(int bet) {	
			betting = bet;
			// generates 3 random numbers
			reelOne = rand.nextInt(7)+1;
			reelTwo = rand.nextInt(7)+1;
			reelThree = rand.nextInt(7)+1;
			// if statement for getting three numbers in a row
			if(reelOne == reelTwo && reelTwo == reelThree) {
				won = betting*reelOne*5;
				denero =  won + denero - betting;
				
			}
			// else if statement for getting 2 numbers in a row
			else if(reelOne == reelTwo) {
				won = betting*reelTwo;
				denero = won + denero - betting;
				
			}
			// winning nothing
			else {
				won = 0;
				denero = denero - betting;
				
			}
			
			
			}
		// print method to show the results of your spin
		public void printSlot() {
			System.out.println("+---+---+---+");
			System.out.println("| " + reelOne + " | " + reelTwo + " | " + reelThree + " |");
			System.out.println("+---+---+---+");	
		}
		// print methods making sure that i dont print out the resuts 1,000,000 times
		public void printFinalPhrase() {
			System.out.println("Thanks for Playing. Your Final Balance: $" + denero);
		}
		
		public void printPhrase() {
			System.out.println("You Won: $" + won);
			System.out.println("Balance: $" + denero);
		}
		
	}
