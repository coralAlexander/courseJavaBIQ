package Junit_Test_for_NumCollection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class TestClass {
   
    @Ignore
    @Test(expected = UnsortedException.class)
    public void badTestNotSorted() throws UnsortedException {
       NumCollection numCollect = new NumCollection("1,3,4,1");
    }
    @Ignore
    @Test(expected = UnsortedException.class)
    public void badTestNumberInRange() throws UnsortedException {
        NumCollection numCollect = new NumCollection("-1--5");
      
     }
    @Ignore
    @Test(expected = EmptyStackException.class)
    public void badEmptyString() throws UnsortedException {
        NumCollection numCollect = new NumCollection("");
         
     }
    @Test
    public void goodTestNumberInRange() throws UnsortedException {
        NumCollection numCollect = new NumCollection("-5--1");
        assertTrue("The number not in range ",numCollect.contains(-4));  
     } 
    @Ignore
    @Test
    public void badTestNumberOutOfRange() throws UnsortedException {
        NumCollection numCollect = new NumCollection("-5--1,100,200");
        assertFalse("The number not in range ",numCollect.contains(0));
     }
    @Ignore
    @Test
    public void goodTestInterator() throws UnsortedException { 
        NumCollection numCollect = new NumCollection("1,2,3,5,6");
        int [] arr = {1,2,3,5,6};
        int index = 0 ; 
        for (int number : numCollect) {
            assertEquals(number, arr[index]);
            index++;
        }
     }
    
}
