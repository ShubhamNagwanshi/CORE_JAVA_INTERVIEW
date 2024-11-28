package practical;

public final class Immutable {
	
	private final int num;
	
	public Immutable(int num) {
		this.num = num;
	}
	
	public int value() {
		return num;
	}

	public static void main(String[] args) {
		Immutable im = new Immutable(10);
		
		System.out.println(im.value());
	}
}
