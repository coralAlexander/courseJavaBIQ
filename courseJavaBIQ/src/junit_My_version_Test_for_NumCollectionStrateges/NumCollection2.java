package junit_My_version_Test_for_NumCollectionStrateges;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;

import iterator_Integers.MyIntegerIterator;

public class NumCollection2 implements Iterable<Integer> {
	int strat;
	private int minNumInRange;
	private int maxNumInRange ;
	private int totalNumsInRange;
	private String numCollectionStr;
	private ArrayList<Integer> list = new ArrayList<>();
    
	public NumCollection2(String numCollectionStr) throws UnsortedException {
		this.numCollectionStr = numCollectionStr;
		if (!numCollectionStr.equals("")) {
			numVerification(numCollectionStr);
		} else {
			throw new EmptyStackException();
		}
		if (totalNumsInRange > 1000) {
		
			 strat = 1;	
		}
	}

	public boolean contains(int number) {
		for (Integer curr : list) {
			if (curr == number) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Integer> numVerification(String numCollectionStr) throws UnsortedException {
		
		int num1 = 0;
		int num2 = 0;
		String commaSiparetorParts[] = numCollectionStr.split(",");

		for (int i = 0; i < commaSiparetorParts.length; i++) {
			if (commaSiparetorParts[i].length() >= 1) {
				String minusSeparetorPart[] = commaSiparetorParts[i].split("-");
				if (minusSeparetorPart.length > 1) {
					// Check if after split the 0 place is empty , this is num with "-" sight .
					if (minusSeparetorPart[0].equals("") && (!(minusSeparetorPart.length > 2))) {
						minNumInRange = Integer.parseInt(minusSeparetorPart[1]);
						minNumInRange = -1 * minNumInRange;
						maxNumInRange = Integer.parseInt(minusSeparetorPart[3]);
						//list.add(minNumInRange);
					}
					// range : Insert all numbers between two negatives .
					else if (minusSeparetorPart[0].equals("") && minusSeparetorPart[2].equals("")) {
						minNumInRange = Integer.parseInt(minusSeparetorPart[1]);
						minNumInRange = -1 * num1;
						maxNumInRange = Integer.parseInt(minusSeparetorPart[3]);
						maxNumInRange = -1 * num2;

						if (maxNumInRange > maxNumInRange) {
							throw new UnsortedException("Unsorted List");
						} else {

							for (int j = minNumInRange; j <= maxNumInRange; j++) {
								//list.add(j);
							}
						}
					}
					// range : Insert number between negative and positive numbers .
					else if (minusSeparetorPart[0].equals("") && (!(minusSeparetorPart[2].equals("")))) {
						minNumInRange = Integer.parseInt(minusSeparetorPart[1]);
						minNumInRange = -1 * num1;
						maxNumInRange = Integer.parseInt(minusSeparetorPart[2]);
						for (int j = minNumInRange; j <= maxNumInRange; j++) {
							//list.add(j);
						}
					}

					else {
						// range : Insert all positive numbers between num1 and num2 to list .
						minNumInRange = Integer.parseInt(minusSeparetorPart[0]);
						maxNumInRange = Integer.parseInt(minusSeparetorPart[1]);
						for (int j = minNumInRange; j <= maxNumInRange; j++) {
							//list.add(j);
						}
					}
				} else {
					minNumInRange = Integer.parseInt(minusSeparetorPart[0]);
					list.add(minNumInRange);
				}
			}
		}
		// verify is the list sorted if not , UnsortedException .
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) > list.get(i + 1)) {

				throw new UnsortedException("Unsorted List");
			}
		}
		Collections.sort(list);
		return list;
	}

	@Override
	public Iterator<Integer> iterator() {
		return list.iterator();
	}

	public void slipStringToNumbers(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == '-' && (!(str.charAt(i + 1) == '-'))) {

			}
		}
	}

	public int getminNumInRange() {
		return minNumInRange;
	}

	public void setminNumInRange(int minNumInRange) {
		this.minNumInRange = minNumInRange;
	}

	public int getmaxNumInRange() {
		return maxNumInRange;
	}

	public void setmaxNumInRange(int maxNumInRange) {
		this.maxNumInRange = maxNumInRange;
	}
	private int[] getNumbers(String rangeStr) {
        rangeStr = rangeStr.trim();
        // it might be that index 0 is '-' but this is never a range separator
        // so we start looking for range separator from index 1
        // Note: according to java api it is legit to call indexOf with
        // fromIndex>=length - so we don't worry about one digit numbers
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
                //throw new UnsortedValuesException();
            }
            return new int[] {first, second};
        }
    }

}
