package week11;

import java.util.Stack;

public class stackpractice {

	public static void main(String[] args) {
		Stack<String> stacker = new Stack<>();
		stacker.push("People");
		stacker.push("Forbes");
		stacker.push("Cosmopolitan");
		stacker.push("Sports Illustarted");
		stacker.push("National Geographic");
		System.out.println(stacker.toString());
		stacker.pop();
		System.out.println(stacker.toString());
		System.out.println(stacker.search("Forbes"));
		System.out.println(stacker.search("Dogo"));
		System.out.println(stacker.empty());
		while(stacker.empty() == false) {
			stacker.pop();
		}
		System.out.println(stacker.toString());
		System.out.println(stacker.empty());
	}
	
	
	
}
