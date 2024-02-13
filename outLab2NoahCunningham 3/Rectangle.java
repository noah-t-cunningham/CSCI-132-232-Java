package Object_Oriented_Shapes;

public class Rectangle implements Shape {
	protected double Width;
	protected double Height;
	
	public Rectangle() {}
	
	public Rectangle(double W,double H) {
		Width = W;
		Height = H;
	}
	
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