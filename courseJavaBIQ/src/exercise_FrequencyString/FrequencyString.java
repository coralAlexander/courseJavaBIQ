package exercise_FrequencyString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ac424x
 *
 */

public class FrequencyString {

	public static void main(String[] args) {

         HashMap<String, Integer> map = countWords(args); 
         printNameChart (map);
       
    }

    /**
     * Method count how many times the name present .
     * @param  Array list
     * @return Hash map 
     */
    public static HashMap<String, Integer> countWords(String[] args)
    {
        HashMap<String, Integer> result = new HashMap<>();
        for(String s : args){
        String updatedS = s.toUpperCase();
            if(result.containsKey(updatedS)){// if map include the current string.
                result.put(updatedS, result.get(updatedS)+1);
            } else {
                result.put(updatedS, 1);
            }
        }
        return result;
    }
    /**
     * Method print the name chart 
     * @param map
     */
    public static void printNameChart ( HashMap<String, Integer> map) {
    	 for (Map.Entry<String, Integer> pair : map.entrySet())
         {
    		System.out.print(pair.getKey() +  "  " ); 
         	// 
    		for(int i = 0 ; i < pair.getValue(); i++) {
         		char str = '#';
         		System.out.print(str);
         	}
         	 System.out.println();
         	 printBarChart(calcCharFrequency(pair.getKey()));
         	
         }
    	
    }
    /**
     * @param str
     * @return
     */
    private static int[] calcCharFrequency(String str) {
    	int[] frequencies = new int['Z' - 'A' + 1];
            for(int i = 0; i<str.length(); ++i) {
                char theChar = str.charAt(i);
                if(theChar >= 'A' && theChar <= 'Z') {
                    frequencies[theChar - 'A']++;   
            }
        }
        return frequencies;
    }
    /**
     * @param frequencies
     */
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
    }
}
   