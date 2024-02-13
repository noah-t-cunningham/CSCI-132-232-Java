package Object_Oriented_Shapes;
// import math so i can use square root function
import java.lang.Math; 
public class EquilateralTriangle extends Triange{
//  need empty constructure because i have another constructor
	public EquilateralTriangle() {}
// constructor that takes inputs and sets variables
	public EquilateralTriangle(double Side) {
		super.Height = Side*Math.sqrt(3);
		super.Base = Side;
	}
// calculations for for the methods i need	
	public double getArea() {
		return Base*Height;
	}
	
	public double getPerimeter() {
		return Base*3;
	}
}
