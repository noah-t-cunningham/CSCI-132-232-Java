package Object_Oriented_Shapes;
 
public class Cirlce implements Shape {
	protected double radius;
	
	public Cirlce(){}
	
	public Cirlce(double r){
		radius = r;
	}
	
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
