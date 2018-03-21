package file_Write_Objects_to_File;

public class Rectangle extends Shape {

	private int per;
	
	public Rectangle( String color,int per) {
		super( color);
		this.per=per;
	}

	@Override
	public String toString() {
		return "Rectangle [per=" + per + "]";
	}
	
	
}
