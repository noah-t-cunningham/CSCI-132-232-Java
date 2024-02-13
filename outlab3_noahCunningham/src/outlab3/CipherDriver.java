package outlab3;

import java.util.Scanner;



public class CipherDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//Initialized the scanner
		String EDdy = null;
		
		String STkey = null;
		int[] intkey = new int[3]; //Start the integer array
		System.out.println("Enter a three digit key: ");
		STkey = input.nextLine();//The encryption key is entered here
		char[] charkey = STkey.toCharArray();//Convert the string to an array
		intkey[0] = Character.getNumericValue(charkey[0]);//get the ASCII value 
		intkey[1] = Character.getNumericValue(charkey[1]);
		intkey[2] = Character.getNumericValue(charkey[2]);
		System.out.println("Your key is: " + intkey[0] + "-" + intkey[1] + "-" + intkey[2]);
		//Print the key
		CaesarCipher cipher = new CaesarCipher(intkey[0], intkey[1], intkey[2]);
		System.out.println("Enter E to encrypt or D to decrypt: ");
		String ED = input.nextLine();//Either encrypt or decrypt the string
		ED = ED.toUpperCase();//Accept upper or lower case user input
		
			if(ED.equals("E") || ED.equals("1")) {//Encrypt it 
				EDdy = "encrypt";
				System.out.println("Enter the message to " + EDdy + ": ");
				String message = input.nextLine();//Input user message
				message = message.toUpperCase();
				String coded = cipher.encrypt(message);//Encrypt the message 
				System.out.println("Secret: " + coded);//Print the message
			}
			else if(ED.equals("D") || ED.equals("2")) {
				EDdy = "decrypt";
				System.out.println("Enter the message to " + EDdy + ": ");
				String message = input.nextLine();//Take the coded information
				message = message.toUpperCase();
				String answer = cipher.decrypt(message);
				System.out.println("Message: " + answer);//Print the decoded 
			}
		
	}
}
