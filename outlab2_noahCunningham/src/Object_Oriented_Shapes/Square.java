package Object_Oriented_Shapes;
// extends rectangle class 
public class Square extends Rectangle{
	// set side = to width and height then it does everything else the
	// rectangle class does
	public Square(double Side) {
		super.Height = Side;
		super.Width = Side;
	}
}

