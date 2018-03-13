package exTestforNumCollection;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

    @Test
    public void test() {
       NumCollection numCollect = new NumCollection("5-7,-100,346");
       assertEquals("Message",numCollect.contains(-2), true);
    }

}
