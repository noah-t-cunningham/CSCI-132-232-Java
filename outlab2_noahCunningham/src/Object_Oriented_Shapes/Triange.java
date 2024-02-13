package Object_Oriented_Shapes;
// implements shape interface
public class Triange implements Shape {
	// initialize the variables i need
	protected double Height;
	protected double Base;
// create the three methods but make the area and perimeter 0 because
// im not constructing anything in this class and wont have any inputs
	public double getArea() {
		return 0;
	}
	
	public double getPerimeter() {
		return 0;
	}

	public String printNumSides() {
		return "Three Sided";
	}
	
}
