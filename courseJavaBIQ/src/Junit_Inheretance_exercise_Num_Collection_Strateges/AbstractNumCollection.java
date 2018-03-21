package Junit_Inheretance_exercise_Num_Collection_Strateges;

import Junit_Inheretance_exercise_Num_Collection_Strateges.UnsortedValuesException;

abstract public class AbstractNumCollection implements Iterable<Integer> {

    abstract public boolean contains(int num);

    protected void addRanges(String[] numbersRangeStr) {        
        for(String rangeStr : numbersRangeStr) {
            addRange(rangeStr);
        }
    }

    private void addRange(String rangeStr) {
        rangeStr = rangeStr.trim();
        // if might be that index 0 is '-' but this is never a range separator
        // so we start looking for range separator from index 1
        // Note: according to java api it is legit to call indexOf with
        // fromIndex>=length - so we don't worry about one digit numbers
        int rangeSeparatorPos = rangeStr.indexOf('-', 1);
        if(rangeSeparatorPos == -1) {
            // no range!
            int num = Integer.parseInt(rangeStr);
            addSingleNumber(num);
        }
        else {
            // we have a range!
            int first = Integer.parseInt(rangeStr.substring(0, rangeSeparatorPos).trim());
            int second = Integer.parseInt(rangeStr.substring(rangeSeparatorPos+1).trim());
            if(second <= first) {
                throw new UnsortedValuesException();
            }
            addRange(first, second);
        }
    }

    protected abstract void addRange(int first, int second);

    protected abstract void addSingleNumber(int num);


}
