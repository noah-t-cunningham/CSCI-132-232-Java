package Object_Oriented_Shapes;
// import math to use the square root function
import java.lang.Math;
public class RightTriangle extends Triange{
//  need empty constructor because i have a another constructor
	public RightTriangle() {}
	// constructor that takes inputs and sets variables
	public RightTriangle(double A, double B) {
		super.Base = A;
		super.Height = B;
				
	}
	// calculations for for the methods i need	
	public double getHypotnuse() {
		return Math.sqrt(Math.pow(super.Base, 2)+Math.pow(super.Height, 2));
	}
	
	public double getArea() {
		return (super.Base*super.Height)/2;
	}
	
	public double getPerimeter() {
		return super.Base+super.Height+ this.getHypotnuse();
	}
	
}
