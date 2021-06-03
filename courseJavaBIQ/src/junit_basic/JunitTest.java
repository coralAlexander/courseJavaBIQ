package junit_basic;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class JunitTest {

    @Test
    public void test1() {
        Map<String ,Integer> map = new HashMap<>();
        Integer num = 1 ;
        map.put("Alex", num);
        assertEquals("My test should be ok ",map.get("Alex"), num);
    }
    
    @Test 
    public void test2() {
        Person p = new Person("Alex", 37);
        Person p1= new Person ("Alex",27);
        Map<Person ,Integer> map = new HashMap<>();
        Integer num = 1 ;
        map.put(p, num);
        assertEquals(map.get(p1),num);
     }
    
        @Test(expected=IndexOutOfBoundsException.class)
        public void getOnEmptyArrayList() {
          new ArrayList<Object>().get(0);
     }
}
   