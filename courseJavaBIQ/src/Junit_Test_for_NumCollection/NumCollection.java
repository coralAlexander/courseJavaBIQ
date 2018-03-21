package Junit_Test_for_NumCollection;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;

import iterator_Integers.MyIntegerIterator;

public class NumCollection implements Iterable<Integer> {

	private int minRange;
	private int maxRange ; 
	private String numCollectionStr;
	private ArrayList<Integer> list = new ArrayList<>();
    
	public NumCollection(String numCollectionStr) throws UnsortedException {
		this.numCollectionStr = numCollectionStr;
		if (!numCollectionStr.equals("")) {
			numVerification(numCollectionStr);
		} else {
			throw new EmptyStackException();
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
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		String commaSiparetorParts[] = numCollectionStr.split(",");

		for (int i = 0; i < commaSiparetorParts.length; i++) {
			if (commaSiparetorParts[i].length() >= 1) {
				String minusSeparetorPart[] = commaSiparetorParts[i].split("-");
				if (minusSeparetorPart.length > 1) {
					// Check if after split the 0 place is empty , this is num with "-" sight .
					if (minusSeparetorPart[0].equals("") && (!(minusSeparetorPart.length > 2))) {
						num = Integer.parseInt(minusSeparetorPart[1]);
						num = -1 * num;
						list.add(num);
					}
					// range : Insert all numbers between two negatives .
					else if (minusSeparetorPart[0].equals("") && minusSeparetorPart[2].equals("")) {
						num1 = Integer.parseInt(minusSeparetorPart[1]);
						num1 = -1 * num1;
						num2 = Integer.parseInt(minusSeparetorPart[3]);
						num2 = -1 * num2;

						if (num1 > num2) {
							throw new UnsortedException("Unsorted List");
						} else {

							for (int j = num1; j <= num2; j++) {
								list.add(j);
							}
						}
					}
					// range : Insert number between negative and positive numbers .
					else if (minusSeparetorPart[0].equals("") && (!(minusSeparetorPart[2].equals("")))) {
						num1 = Integer.parseInt(minusSeparetorPart[1]);
						num1 = -1 * num1;
						num2 = Integer.parseInt(minusSeparetorPart[2]);
						for (int j = num1; j <= num2; j++) {
							list.add(j);
						}
					}

					else {
						// range : Insert all positive numbers between num1 and num2 to list .
						num1 = Integer.parseInt(minusSeparetorPart[0]);
						num2 = Integer.parseInt(minusSeparetorPart[1]);
						for (int j = num1; j <= num2; j++) {
							list.add(j);
						}
					}
				} else {
					num = Integer.parseInt(minusSeparetorPart[0]);
					list.add(num);
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

	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}
	

}
