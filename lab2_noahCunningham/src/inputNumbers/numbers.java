package inputNumbers;
//import scanner class
import java.util.Scanner;

public class numbers {
	// making my main method
	public static void main(String[] args) {
	// making a scanner variable called input
	Scanner input = new Scanner(System.in);
	// making a variable called howMany
	int howMany;
	// print out a statement and taking its input setting it equal to howMany
	System.out.println("Enter How Many Numbers: ");
	howMany = input.nextInt();
	// making a list that is howMany length long
	int[] numerus = new int[howMany];
	// for loop to create the actual list
	// i ask fo an inoput and then it inserts that input into a list 
	for (int i = 0; i < numerus.length; i++) {
		System.out.println("Enter Numbers: ");
		int number = input.nextInt(); 
		numerus[i] = number;
		}
		// making a variable named matches
		int matches = 0;
		//  2 for loops the iterate through the list and compare every possible
		// combination to check if they are matching, then I add 1 to the
		// matches variable if they are matching
		for (int j = 0; j < numerus.length; j++) {
				for (int z = j+1; z < numerus.length; z++) {
				if(numerus[j] == numerus[z]) {
					matches += 1;
				}
			}
		}	
		// if statements that check if there are any matches and if there is a 
		// match it print out how many matches you had
		if(matches > 0) {
			System.out.println("You Have " +  matches + " Matche(s)");
		}
		if(matches == 0) {
			System.out.println("You Have NO Matches");
		}
	}
}
