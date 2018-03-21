package Junit_Inheretance_exercise_Num_Collection_Strateges;

import java.util.Iterator;

import Junit_Inheretance_exercise_Num_Collection_Strateges.AbstractNumCollection;
import Junit_Inheretance_exercise_Num_Collection_Strateges.NumCollectionWithBoolArray;
import Junit_Inheretance_exercise_Num_Collection_Strateges.NumCollectionWithSet;

public class NumCollection implements Iterable<Integer> {

    private AbstractNumCollection numCollection;

    public NumCollection(String numCollectionStr) {
        String[] numbersRangeStr = numCollectionStr.split(",");
        int min = getFirst(numbersRangeStr[0]);
        int max = getSecond(numbersRangeStr[numbersRangeStr.length-1]);
        if(max < min) {
            throw new UnsortedValuesException();
        }
        if(max - min + 1 <= 1000) { // TODO: move magic numbers to static variable
            numCollection = new NumCollectionWithBoolArray(numbersRangeStr, min, max);
        }
        else if(numbersRangeStr.length + 1 <= 100) { // TODO: move magic numbers to static variable
            // TODO: add here the other strategy
        } else {
            numCollection = new NumCollectionWithSet(numbersRangeStr, min, max);
        }
    }

    private int getFirst(String rangeStr) {
        return getNumbers(rangeStr)[0];
    }

    private int getSecond(String rangeStr) {
        return getNumbers(rangeStr)[1];
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
                throw new UnsortedValuesException();
            }
            return new int[] {first, second};
        }
    }

    public boolean contains(int num) {
        return numCollection.contains(num);
    }

    @Override
    public Iterator<Integer> iterator() {
        return numCollection.iterator();
    }

}
