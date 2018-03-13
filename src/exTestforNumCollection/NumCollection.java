package exTestforNumCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class NumCollection implements Iterable<Integer> {

    private String numCollectionStr;
    private ArrayList<Integer> list = new ArrayList<>();
    public NumCollection(String numCollectionStr) {
        this.numCollectionStr = numCollectionStr;
        numVerification(numCollectionStr);
    }

    /**
     * Checks whether this NumberCollection contains a certain number
     * 
     * @param number The number to check for
     * @return true if the number is in the collection, otherwise false
     */
    public boolean contains(int number) {
    	for (Integer curr : list) {
			if (curr == number) {
				return true;
			}	
		}
    	return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        
        return null;
    }

    public ArrayList<Integer> numVerification(String numCollectionStr) {
        int num  = 0;
    	int num1 = 0;
        int num2 = 0;
        String arr[] = numCollectionStr.split(",");
        for(int i=0 ; i< arr.length;i++) {
           if (arr[i].length()>=1) {
            String arr1[] = arr[i].split("-");
              if (arr1.length>1) {
            	  if(arr1[0].equals("")) {
            		  num1 = Integer.parseInt(arr1[1]);
            		  num1= -1 * num1;
            		  list.add(num1);
            	  }
            	  else {
            		  num1 = Integer.parseInt(arr1[0]);
                      num2 = Integer.parseInt(arr1[1]);
                      for(int j=num1 ; j<=num2 ;j++) {
                    	 list.add(j);
                      } 
            	  } 
              }
              else {
                  num = Integer.parseInt(arr1[0]);
                  list.add(num);
              }       
           } 
        }  
       for (int i=0; i<list.size()-1;i++) {
		if(list.get(i)>list.get(i+1)) {
			try {
				throw new UnsortedException("Unsorted List");
			} catch (UnsortedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
        Collections.sort(list);
        return list;
    }
    
}
