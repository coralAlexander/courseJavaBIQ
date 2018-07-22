package file_Write_Objects_to_File_Serializable;

import java.io.Serializable;

public abstract class Shape implements Serializable {

	private String color ;
	
	public Shape(String color) {
	    	    this.color=color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
}
