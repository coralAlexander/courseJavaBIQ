package junit_Inheretance_exercise_Num_Collection_Strateges;


import static org.junit.Assert.*;

import org.junit.Test;

public class NumCollectionTest {

    @Test
    public void positiveContainsSimple() {
        String numCollectionStr = "50,60-100";
        NumCollection numCollection = new NumCollection(numCollectionStr);
        assertTrue(numCollection.contains(50));
    }

    /*@Test
    void positiveContainsComplex() {
        String numCollectionStr = " -200, -100--80, -60 --40, -30- -10, -5-4, 12 ";
        int[] numbers = {-200, -100, -90, -80, -60, -50, -40, -30, -20, -10, -5, 0, 4, 12};
        NumCollection numCollection = new NumCollection(numCollectionStr);
        for(int num : numbers) {
            assertTrue("number: " + num + " should be inside!",numCollection.contains(num));
        }
    }

    @Test
    void negativeContainsComplex() {
        String numCollectionStr = " -200, -100--80, -60 --40, -30- -10, -5-4, 12 ";
        int[] numbers = {-201, -101, -79, -61, -39, -31, -9, -6, 5, 13};
        NumCollection numCollection = new NumCollection(numCollectionStr);
        for(int num : numbers) {
            assertFalse(numCollection.contains(num), "number: " + num + " is inside!");
        }
    }

    @Test
    void negativeContainsSimple() {
        String numCollectionStr = "50";
        NumCollection numCollection = new NumCollection(numCollectionStr);
        assertFalse(numCollection.contains(51));
    }

    @Test
    void negativeSortedException1() {
        assertThrows(UnsortedValuesException.class,
                ()->{
                    new NumCollection("56, 50");
                });
    }

    @Test
    void negativeSortedException2() {
        assertThrows(UnsortedValuesException.class,
                ()->{
                    new NumCollection("56, 57, -58");
                });
    }

    @Test
    void negativeSortedException3() {
        assertThrows(UnsortedValuesException.class,
                ()->{
                    new NumCollection("20, 59-58, 60");
                });
    }

    @Test
    void positiveIteratorSimple() {
        NumCollection numCollection = new NumCollection("50, 76");
        assertEquals(Integer.valueOf(50), numCollection.iterator().next());
    }

    @Test
    void positiveIteratorComplex() {
        NumCollection numCollection = new NumCollection("-40--38, -10--8, 50, 76, 80-82");
        int[] numbers = {-40, -39, -38, -10, -9, -8, 50, 76, 80, 81, 82};
        Iterator<Integer> itr = numCollection.iterator();
        for(int num : numbers) {
           assertEquals(Integer.valueOf(num), itr.next(), "number: " + num + " should be inside!");
        }
        assertFalse(itr.hasNext());
    }*/
}