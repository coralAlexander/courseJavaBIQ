package file_readWriteToFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class readFromFile {

	public static void main(String[] args) throws IOException {
		BufferedReader in =null;
		BufferedWriter writer=null;
		String fromPath ="C:\\Users\\Coral Alexander\\Desktop\\test\\fileFrom.txt" ;
		//String toPath = "C:\\Users\\Desktop\\test\\fileTo.txt";
		
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(fromPath),"UTF-8"));
			//writer = new BufferedWriter(new FileWriter(toPath));
			
		String str;
			while((str= in.readLine()) !=null) {
				System.out.println(str.toUpperCase());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			in.close();
		}
	}
    
	 private static int[] calcCharFrequency(String str) {
	        int[] frequencies = new int['Z' - 'A' + 1];
	            for(int i = 0; i<str.length(); ++i) {
	                char theChar = Character.toUpperCase(str.charAt(i));
	                if(theChar >= 'A' && theChar <= 'Z') {
	                    frequencies[theChar - 'A']++;
	            }
	        }
	        return frequencies;
	    }
	
	 private static void printBarChart(int[] frequencies) {
	        for(int i = 0; i < frequencies.length; ++i) {
	            if(frequencies[i] > 0) {
	                System.out.print((char)('A' + i) + "  ");
	                for(int j=0; j<frequencies[i]; ++j) {
	                    System.out.print('#');
	                }
	                System.out.println();
	            }
	        
	    }
	 }}
