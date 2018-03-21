package file_print_File_size;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class PathTofile {

	public static void main(String[] args) throws FileNotFoundException {
		
		printFileSize(args);

	}
 public static void printFileSize(String [] args) throws FileNotFoundException {
	 for (String currPath : args) {
		 File file =new File(currPath);
			if(file.exists()){
				double bytes = file.length();
			    String fileName= file.getName();
				System.out.println("Path : "+currPath +"  = "+" Size :"+  bytes + " File name :  "+ fileName );
			}else{
				 System.out.println("File does not exists!");
			}
	    }
	}
 }
