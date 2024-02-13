package week5;

public class commandLine {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("You Need a String followed by an int");
			return;			
		}
		
		String userString = args[0];
		
		int n = Integer.parseInt(args[1]);
		
		for(int i = 0; i < n; i++) {
			System.out.println(userString);
		}
	}
	
}
