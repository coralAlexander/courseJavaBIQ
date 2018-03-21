package file_readWriteToFile;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadAndWriteToFile {

	public static void main(String[] args) {
		String file = "c:\\test\\testFile.txt";
		BufferedReader reader = null;
		ArrayList<String> list = new ArrayList<>();
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charset.forName("UTF-8")));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				for (String string : line.split("\\|")) {
					list.add(string);
				}
				
				String name = list.get(2);
				
				list.set(2, "Alexander");
				
				System.out.println(list);
			}
		} catch (IOException e) {
			// log error
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// log warning
				}
			}
		}
	}
}
