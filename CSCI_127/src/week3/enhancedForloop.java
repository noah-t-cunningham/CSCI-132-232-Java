package week3;

import java.util.Arrays;

public class enhancedForloop {
	public static void main(String[] args) {
		String[] myList = {"Apples", "Bannanas", "Eggs", "Bread", "Cookies", "Chips"}; 	
		/*for (String item: myList) {
			System.out.println(item);
		}
		for(int i = 2; i <= 4; i++ ) {
			System.out.println(myList[i]);
		}*/
		System.out.println("Grocrey List: " + Arrays.toString(myList));
		
		String myString = "Hello World";
		System.out.println(myString);
		char myChar = myString.charAt(4);
		System.out.println(myChar);
		int stringLength = myString.length();
		System.out.println(stringLength);
	
	}
}