package extracredit1_noahCunningham;
/** import random and stack**/
import java.util.Random;

import java.util.Stack;

public class pushinInts {
	
	public static void main(String args[]) {
		/** create variables **/
		Random rand = new Random();
		Stack<Integer> stack = new Stack<>();
		double x = 0;
		double tot = 0;
		/**for loop that puts 20 random integers from 1 to 100 in the stack**/
		for(int i = 0; i<20; i++) {
			stack.push(rand.nextInt(99)+1);
		}
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		/**not sure if this is what you were asking for but i used the search
		 * to check if 50 was in the stack**/
		System.out.println(stack.search(50));
		System.out.println(stack.isEmpty());
		/**iterate 19 times because satck has 19 elements
		 * add the poped number to tot and increase x by one**/
		for(int i = 0; i<19; i++) {
			tot+=stack.pop();
			x+=1;
		}
		/**divide tot by x to get average**/
		double average = tot/x;
		System.out.println(average);
	}
}
