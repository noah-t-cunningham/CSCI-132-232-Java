package Lab1_noahCunningham;

import java.util.Scanner;

public class MarriedNameSuggestions {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String personOneFirst;
		String personOneLast;
		String personTwoFirst;
		String personTwoLast;
		
		
		System.out.print("Person one, first name: ");
		personOneFirst = input.nextLine();
		System.out.print("Person one,  last name: ");
		personOneLast = input.nextLine();

		// TODO: Get the second person's first and last name from the user.

		System.out.print("Person Two, first name: ");
		personTwoFirst = input.nextLine();
		System.out.print("Person Two,  last name: ");
		personTwoLast = input.nextLine();

		System.out.println("Below are some possible names a married couple go with...");
		
		// TODO: Print separate names unaltered by marriage (Ex: Skyler Doe and Ryley Smith)
		// Change hard coded "Ryley Smith" to user's choice for person two...
		System.out.println(personOneFirst + " " + personOneLast + " and " + personTwoFirst + " " + personTwoLast);
		
		// TODO: Print two same last name possibilities (Ex: Skyler and Ryley Doe)
		System.out.println(personOneFirst + " " + personOneLast + " and " + personTwoFirst + " " + personOneLast);
		System.out.println(personOneFirst + " " + personTwoLast + " and " + personTwoFirst + " " + personTwoLast);
		// TODO: Print two hyphenated last name possibilities (Ex: Skyler and Ryley Doe-Smith)
		System.out.println(personOneFirst + " " + personOneLast + "-" + personTwoLast + " and " + personTwoFirst + " " + personOneLast + "-" + personTwoLast);
		System.out.println(personOneFirst + " " + personTwoLast + "-" + personOneLast + " and " + personTwoFirst + " " + personTwoLast + "-" + personOneLast);
		input.close();
	}

}
