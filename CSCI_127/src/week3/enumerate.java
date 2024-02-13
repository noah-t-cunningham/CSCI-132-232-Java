package week3;

public class enumerate {
	
	enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat};
	
	public static void main(String[] args) {
		
		Day today;
		today = Day.Fri;
		
		/*if(today==Day.Thu) {
			System.out.println("Its Thursday");
		}
		else {
			System.out.println("Its not Thursday");
		}*/
		
		switch (today) {
		case Sat:
		case Sun:
		case Thu:
			System.out.println("No class today");
			break;
		case Tue:
			System.out.println("You have A lab today");
			break;
		case Mon:
		case Wed:
		case Fri:
			System.out.println("You have class today from 3:10pm - 4:00pm");
			break;
		}
}
}
