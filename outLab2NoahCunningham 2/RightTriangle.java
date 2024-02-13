package Object_Oriented_Shapes;
import java.lang.Math;
public class RightTriangle extends Triange{
	
	public RightTriangle() {}
	
	public RightTriangle(double A, double B) {
		super.Base = A;
		super.Height = B;
				
	}
	
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
