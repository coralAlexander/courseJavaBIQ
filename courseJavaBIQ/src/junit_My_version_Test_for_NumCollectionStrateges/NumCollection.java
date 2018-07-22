package junit_My_version_Test_for_NumCollectionStrateges;

import java.sql.Struct;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

import iterator_Integers.MyIntegerIterator;
import junit_Inheretance_exercise_Num_Collection_Strateges.UnsortedValuesException;

public class NumCollection implements Iterable<Integer> {
	int minNum = 0;
	int maxNum = 0;
	int strat;
	int totalRange;
	//private int minNumInRange;
	////private int maxNumInRange ;
	//private int totalNumsInRange;
	private String numCollectionStr;
	private ArrayList<Integer> list = new ArrayList<>();
	private ArrayList<Integer> listOfRange = new ArrayList<>();
	//private ArrayList<ArrayList> totalList = new ArrayList<>();
	private ArrayList<Integer> finalList = new ArrayList<>();
    
	public NumCollection(String numCollectionStr) throws UnsortedException {
		this.numCollectionStr = numCollectionStr;
		if (!numCollectionStr.equals("")) {
		     
			numVerification(numCollectionStr);
			
			int listSize = list.size();
			if(!listOfRange.isEmpty()) {
				int range = listOfRange.get(1) - listOfRange.get(0);
				totalRange = listSize + range;
			}
			else {
				totalRange = listSize;
			}
			
			if (totalRange <= 1000) {	
				StrategyOneUpTo1000 srtUp1000 = new StrategyOneUpTo1000();
				finalList =	srtUp1000.addToArrayList(listOfRange, list);
			}
			else {
				
			}
			
		} else {
			throw new EmptyStackException();
		}
	}

	public boolean contains(int number) {
		for (int  curr : finalList) {
			if (curr == number) {
				return true;
			}
		}
		return false;
	}

	public void numVerification(String numCollectionStr) throws UnsortedException {
		
		
		String commaSiparetorParts[] = numCollectionStr.split(",");

		for (int i = 0; i < commaSiparetorParts.length; i++) {
			int[] arrFirstAndSecond  =	getNumbers(commaSiparetorParts[i]);
		    int minNum = arrFirstAndSecond[0];
		    int maxNum = arrFirstAndSecond[1];
		     if(!(minNum == maxNum)) {
		    	if (minNum<maxNum) {
		    		 listOfRange.add(minNum);
					 listOfRange.add(maxNum);
		    	}
		    	else {
		    		throw new UnsortedException("Unsorted List");
		    	}		    	
		     }
		     else {
		    	 list.add(minNum);
		     }  
		  } 
		// verify is the list sorted if not , UnsortedException .
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) > list.get(i + 1)) {
				throw new UnsortedException("Unsorted List");
			}
			else if (list.get(0)< maxNum || list.get(list.size()-1) < minNum ) {
				throw new UnsortedException("Unsorted List");
			}
		}
	  }

	@Override
	public Iterator<Integer> iterator() {
		return finalList.iterator();
	}
	private int[] getNumbers(String rangeStr) {
        rangeStr = rangeStr.trim();
        int rangeSeparatorPos = rangeStr.indexOf('-', 1);
        if(rangeSeparatorPos == -1) {
            // no range!
            int num = Integer.parseInt(rangeStr);
            return new int[] {num, num};
        }
        else {
            // we have a range!
            int first = Integer.parseInt(rangeStr.substring(0, rangeSeparatorPos).trim());
            int second = Integer.parseInt(rangeStr.substring(rangeSeparatorPos+1).trim());
            if(second <= first) {
                throw new UnsortedValuesException();
            }
            return new int[] {first, second};
        }
    }

}
