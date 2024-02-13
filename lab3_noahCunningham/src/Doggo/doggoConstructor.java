package Doggo;
import java.util.Scanner;
public class doggoConstructor {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	String dogoName;
	int dogoAge = 0;
	double dogoWeight = 0;
	
	
	System.out.println("What is Doggo's name?");
	dogoName = input.nextLine();
	
	System.out.println("What is " + dogoName + "'s Age in Human Years");
	
	while(!input.hasNextInt()) {
		input.next();
		System.out.println("Enter a Number");
	}

	dogoAge = input.nextInt();
	
	System.out.println("What is " + dogoName + "'s Weight in Pounds");
	while(!input.hasNextDouble()) {
		input.next();
		System.out.println("Enter a Float");
	}
	dogoWeight = input.nextDouble();
	
	
	doggo theDog = new doggo(dogoName, dogoAge, dogoWeight);
	
	System.out.println("---Dogo's Info---");
	System.out.println(theDog.getName() + " " + theDog.getAge() + " " + theDog.getWeight());
	
	System.out.println("HAPPY BIRTHDAY " + dogoName + "!");
	theDog.setAge(theDog.getAge()/7 + 1);
	System.out.println(theDog.getAge());
	}
}
