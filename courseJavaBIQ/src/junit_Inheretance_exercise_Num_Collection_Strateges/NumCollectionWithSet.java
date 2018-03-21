package junit_Inheretance_exercise_Num_Collection_Strateges;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class NumCollectionWithSet extends AbstractNumCollection implements Iterable<Integer> {

    private Set<Integer> numbers = new TreeSet<>();
    // TODO: make sure with sys engineer that we can use MIN_VALUE like that
    private int max = Integer.MIN_VALUE;

    public NumCollectionWithSet(String[] numbersRangeStr, int min, int max) {
        addRanges(numbersRangeStr);
    }

    public boolean contains(int num) {
        return numbers.contains(num);
    }

    @Override
    protected void addRange(int first, int second) {
        if(first <= getMax()) {
            throw new UnsortedValuesException();
        }
        for(int num=first; num<=second; ++num) {
            numbers.add(num);
        }
        max = second;
    }

    @Override
    protected void addSingleNumber(int num) {
        if(num <= getMax()) {
            throw new UnsortedValuesException();
        }
        numbers.add(num);
        max = num;
    }

    @Override
    public Iterator<Integer> iterator() {
        return numbers.iterator();
    }

    public int getMax() {
        return max;
    }
}
