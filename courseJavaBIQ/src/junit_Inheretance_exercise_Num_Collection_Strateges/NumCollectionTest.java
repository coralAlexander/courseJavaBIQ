package junit_Inheretance_exercise_Num_Collection_Strateges;


import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Ignore;
import org.junit.Test;

public class NumCollectionTest {
    @Ignore
    @Test
    public void positiveContainsSimple() {
        String numCollectionStr = "50,60-100";
        NumCollection numCollection = new NumCollection(numCollectionStr);
        assertTrue(numCollection.contains(50));
    }
   @Test
   public void positiveContainsComplex() {
        String numCollectionStr = " -200, -100--80, -60 --40, -30- -10, -5-4, 12 ";
        int[] numbers = {-200, -100, -90, -80, -60, -50, -40, -30, -20, -10, -5, 0, 4, 12};
        NumCollection numCollection = new NumCollection(numCollectionStr);
        for(int num : numbers) {
            assertTrue("number: " + num + " should be inside!",numCollection.contains(num));
        }
    }
    @Ignore
    @Test
    public  void negativeContainsComplex() {
        String numCollectionStr = " -200, -100--80, -60 --40, -30- -10, -5-4, 12 ";
        int[] numbers = {-201, -101, -79, -61, -39, -31, -9, -6, 5, 13};
        NumCollection numCollection = new NumCollection(numCollectionStr);
        for(int num : numbers) {
            assertFalse("number: " + num + " is inside!",numCollection.contains(num));
        }
    }
    @Ignore
    @Test
    public void negativeContainsSimple() {
        String numCollectionStr = "50";
        NumCollection numCollection = new NumCollection(numCollectionStr);
        assertFalse(numCollection.contains(51));
    }
    @Ignore
    @Test(expected=UnsortedValuesException.class)
    public void negativeSortedException1() {
                    new NumCollection("56, 50");  
    }
    @Ignore
    @Test(expected=UnsortedValuesException.class)
    public void negativeSortedException2() {
                    new NumCollection("56, 57, -58");
    }
    @Ignore
    @Test(expected=UnsortedValuesException.class)
    public void negativeSortedException3() {    
                    new NumCollection("20, 59-58, 60");      
    }
    @Ignore
    @Test
    public void positiveIteratorSimple() {
        NumCollection numCollection = new NumCollection("50, 76");
        assertEquals(Integer.valueOf(50), numCollection.iterator().next());
    }
    @Ignore
    @Test
    public void positiveIteratorComplex() {
        NumCollection numCollection = new NumCollection("-40--38, -10--8, 50, 76, 80-82");
        int[] numbers = {-40, -39, -38, -10, -9, -8, 50, 76, 80, 81, 82};
        Iterator<Integer> itr = numCollection.iterator();
        for(int num : numbers) {
           assertEquals("number: " + num + " should be inside!",Integer.valueOf(num), itr.next());
        }
        assertFalse(itr.hasNext());
    }
}