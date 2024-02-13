package Object_Oriented_Shapes;
 // implements shaoe interface
public class Cirlce implements Shape {
	// initialize the variable ill need
	protected double radius;
//  need empty constructor because i have a another constructor
	public Cirlce(){}
	// constructor with inputted values
	public Cirlce(double r){
		radius = r;
	}
	// calculations for the various methods
	public double getArea(){
		return Math.pow(radius, 2)*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public String printNumSides() {
		return "Infinite Sided";
	}
}
