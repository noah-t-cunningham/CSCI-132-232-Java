package Object_Oriented_Shapes;

public class ShapeDemo {
	
	public static void main(String args[]) {
		
		Rectangle rec = new Rectangle(5, 10);
		System.out.println("I made a Rectangle with Width: 5 and Height: 10");
		System.out.println("The Area is: " + rec.getArea());
		System.out.println("The perimeter is: " + rec.getPerimeter());
		System.out.println(rec.printNumSides());
		Square sq = new Square(5);
		System.out.println("I made a Square with Side Length: 5");
		System.out.println("The Area is: " + sq.getArea());
		System.out.println("The perimeter is: " + sq.getPerimeter());
		System.out.println(sq.printNumSides());
		Cirlce cir = new Cirlce(3);
		System.out.println("I made a Circle with Radius: 3");
		System.out.println("The Area is: " + cir.getArea());
		System.out.println("The Diameter is: " + cir.getPerimeter());
		System.out.println(cir.printNumSides());
		EquilateralTriangle et = new EquilateralTriangle(7);
		System.out.println("I made a Equilateral Triangle with a side length of: 7");
		System.out.println("The Area is: " + et.getArea());
		System.out.println("The Perimeter is: " + et.getPerimeter());
		System.out.println(et.printNumSides());
		RightTriangle rt = new RightTriangle(3,4);
		System.out.println("I made a Right Triangle with a Side A: 3 and Side B: 4 ");
		System.out.println("The Hypotnuse is: " + rt.getHypotnuse());
		System.out.println("The Area is: " + rt.getArea());
		System.out.println("The Perimeter is: " + rt.getPerimeter());
		System.out.println(rt.printNumSides());
		
		
		
	}
}
