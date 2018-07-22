package file_Write_Objects_to_File_Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayListToFileMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		List<Shape> list = new ArrayList<>();
		Rectangle r1 = new Rectangle("Red", 23);
		Circle c1 = new Circle("Blue", 4);

		list.add(r1);
		list.add(c1);
		String path = "c:\\test\\test3.txt";
		FileOutputStream fout = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(list);

		FileInputStream in = new FileInputStream(path);
		ObjectInputStream inputStr = new ObjectInputStream(in);
		List<Shape> newList = (List<Shape>) inputStr.readObject();
		for (Shape shape : newList) {
			System.out.println(shape);
		}
	}
}
