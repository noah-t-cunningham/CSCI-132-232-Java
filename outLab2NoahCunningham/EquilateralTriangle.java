package Object_Oriented_Shapes;
import java.lang.Math; 
public class EquilateralTriangle extends Triange{
	
	public EquilateralTriangle() {}
	
	public EquilateralTriangle(double Side) {
		super.Height = Side*Math.sqrt(3);
		super.Base = Side;
	}
	
	public double getArea() {
		return Base*Height;
	}
	
	public double getPerimeter() {
		return Base*3;
	}
}
