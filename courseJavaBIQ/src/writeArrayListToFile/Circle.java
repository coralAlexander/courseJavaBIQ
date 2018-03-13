package writeArrayListToFile;

public class Circle extends Shape {

	private int radius;
	
	public Circle(String color,int radius) {
		super( color);
		this.radius=radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
