package outlab5_noahCunningham;

import java.util.Scanner;
import java.util.Arrays;

public class CallStackValidator {
	public boolean isValid(String S) {
		/**creating a stack**/
		Stack<String> AS = new arrayStack<>();
		String str = S;
		/**making the inputted string into a list split up by spaces**/
		String[] array = str.split(" ");
		/**tried to use the scanner way but couldnt figure it out**/
		Scanner input = new Scanner(str);
		/**set call and halts to variables**/
		String token = "calls";
		String token2 = "halts";
		/**i had to push the first method into the stack as not to get duplicates
		 * or be down a method i know this is maybe to brute force like 
		 * but i even tried to use as for loop and check if there where calls or
		 * halts and then push array[0] if there was, but that didn't work**/
		AS.push(array[0]);
		/**for loop to iterate through the array**/
		for(int i = 0; i < array.length; i++ ) {
			/**if the index of array = calls then we push the method its calling**/
			if(array[i].equals(token)) {
				AS.push(array[i+1]);
			}
			/**if the index of array = halts then we pop the the last method **/
			else if(array[i].equals(token2)) {
				AS.pop();
			}
			/**if false goes onto the else statement, if true does another 
			 * iteration **/
			else if(AS.top().equals(array[i])) {
				
				}
			/**if none of the conditions are met return false**/
			else {
				return false;
			}
			
			}	
		/**return whether the stack is empty or not**/
		return AS.isEmpty();
	}
}
		
/**i tried to do it the scanner way but couldn't figure it out**/		
//		if() {
//			AS.push(token);
//			System.out.println("1");
//		}
//		
//		while(input.hasNext()) {
//			//System.out.println("word:"+ input.next());
//			String word = input.next();
//			if(word.equals(token)) {
//				System.out.println(1);
//				AS.push(token);
//			}
//			else if(word.equals(token2)) {
//				System.out.println(2);
//				AS.pop();
//			}
//			else if(word.equals(AS.top())) {
//				System.out.println(3);
//			}
	


