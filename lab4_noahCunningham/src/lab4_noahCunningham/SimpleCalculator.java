package lab4_noahCunningham;

public class SimpleCalculator {
	// Fields
	// TODO: We need a way to keep track of the running total here
	public double total;
	// Constructor (default is the empty constructor, which works here)
	
	// Methods
	public boolean checkUserOp(String op) {
		// FIXME: only return true only on valid arithmetic character, otherwise re-prompt user and return false

		switch(op) {
		case "+":
			return true;
	
		case "-":
			return true;
		
		case "/":
			return true;
		
		case "^":
			return true;
		
		case "=":
			return true;
			
		default:
			System.out.println("Enter a valid operator:");
			return false;
			
	}
	}
	
	public void calculateAnswer(String op, double nextVal) {
		// TODO: depending on the operator and the next value, update the runningTotal
		switch(op) {
			case "+":
				total = total + nextVal;
				break;
			case "-":
				total = total - nextVal;
				break;
			case "/":
				total = total/nextVal;
				break;
			case "^":
				total = Math.pow(total, nextVal);
				break;
			case "=":
				total = total;
				break;
		}
	}

	public void printAnswer() {
		// TODO: print the answer for the user to see
		System.out.println("Total = " + total);
	}
}
