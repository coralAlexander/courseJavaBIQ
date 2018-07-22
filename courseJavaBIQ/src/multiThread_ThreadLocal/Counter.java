package multiThread_ThreadLocal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counter {
	
	public List<String> fromFile ;
    
	ThreadLocal<Map<String,Integer>> map = new ThreadLocal<>();

	//public Map<String,Integer> map =  new HashMap<>();
	
	public static String path = "resources/sameWords.txt";
	
	public  List<String> readFromFile()   { 
		fromFile = new ArrayList<>();
			BufferedReader in = null;
			try {
				in = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"));
				 String currentLine ;
					while((currentLine = in.readLine()) !=null) {
						fromFile.add(currentLine);	
					}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
		return fromFile;	
	}
	
	private Map<String,Integer> getMap(){	
		Map<String,Integer> m =  map.get();
		if (m == null) {
			m = new HashMap<>();
			map.set(m);
		}
		return m;	
	}
	
	public Map<String,Integer> countTheSameWords(List<String> lines) {
		Map <String,Integer> map = getMap();
		String[] str = null;
		ArrayList<String> list = new ArrayList<>();
		for (String line : lines) {
		  str=line.split("\\s+"); // any number of white spaces.
		}
		for (String string : str) {	
			
			int count = map.getOrDefault(string, 0);
			
			map.put(string, ++count);
		}
		return map;	
	}
}
