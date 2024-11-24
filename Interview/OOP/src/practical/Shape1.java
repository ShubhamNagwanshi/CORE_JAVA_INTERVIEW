package practical;

public class Shape1 {

	private String color;
	private int borderWidth;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public static void main(String[] args) {
		Shape1 s = new Shape1();
		
		s.setBorderWidth(10);
		s.setColor("Red");
		
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
	}
}
