package setget;

public class TestShape {
public static void main(String[] args) {
	
	Shape[] s = new Shape[2];
	
	s[0] = new Rectangle();
	s[1] = new Circle();
	
	Rectangle r = (Rectangle) s[0];
	
	r.setLength(10);
	r.setWidth(5);
	
	Circle c = (Circle) s[1];
	
	c.setRadius(10);
	
	
	System.out.println(s[0].area());
	System.out.println(s[1].area());
}
}
