package Object_Oriented_Shapes;
// implements the interface
public class Rectangle implements Shape {
	// initialize the variable i need
	protected double Width;
	protected double Height;
//  need empty constructor because i have a another constructor
	public Rectangle() {}
	// constructor fir this class where i set the variables to the inputs
	public Rectangle(double W,double H) {
		Width = W;
		Height = H;
	}
	// calculations for the various methods in the interface
	public double getArea() {
		return Width*Height;
	}
	
	public double getPerimeter() {
		return 2*Width+2*Height;
	}
	
	public String printNumSides() {
		return "Four Sided";
	}
}
