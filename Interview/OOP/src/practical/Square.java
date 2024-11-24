package practical;

public class Square extends Shape{
	
	public void draw() {
		System.out.println("Square Shape");
	}
	
	public static void main(String[] args) {
		Shape s = new Square();
		
		s.draw();
	}

}
