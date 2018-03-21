package junit_Inheretance_exercise_Num_Collection_Strateges;

import java.util.Iterator;

import junit_Inheretance_exercise_Num_Collection_Strateges.UnsortedValuesException;

public class NumCollectionWithBoolArray extends AbstractNumCollection {

    // TODO: check that we can use these values
    private int min;
    private int max;
    private int last = Integer.MIN_VALUE;
    boolean[] numarr;

    public NumCollectionWithBoolArray(String[] numbersRangeStr, int min, int max) {
        this.min = min;
        this.max = max;
        numarr = new boolean[max-min + 1];
        addRanges(numbersRangeStr);
    }

    @Override
    public boolean contains(int num) {
        return num >= min && num <= max && numarr[num-min];
    }

    @Override
    protected void addRange(int first, int second) {
        if(first <= last) {
            throw new UnsortedValuesException();
        }
        for(int num = first; num <= second; ++num) {
            numarr[num-min] = true;
        }
        last = second;
    }

    @Override
    protected void addSingleNumber(int num) {
        if(num <= last) {
            throw new UnsortedValuesException();
        }
        numarr[num-min] = true;
        last = num;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int curr = min;
            @Override
            public boolean hasNext() {
                return curr <= max;
            }

            @Override
            public Integer next() {
                int retval = curr;
                do {
                    ++curr;
                } while(curr <= max && !numarr[curr - min]);
                return retval;
            }
        };
    }
}
