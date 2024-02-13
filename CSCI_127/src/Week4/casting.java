package Week4;

public class casting {
	public static void main(String[] args) {
		
		double pi = 3.14159;
		int piINT = (int)pi;
		System.out.println(pi);
		System.out.println(piINT);
		
		int num = 3;
		double myFloat = num;
		System.out.println(myFloat);
		
		Integer objectInt = Integer.valueOf(1045);
		System.out.println(objectInt);
		
		String yearAsString = "2019";
		int yearAsInt = Integer.parseInt(yearAsString);
		System.out.println(yearAsInt + 1);	
	}
}
