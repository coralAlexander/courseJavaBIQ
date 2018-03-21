package junit_Parametrized_Class;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FactorialTest {

    @Parameters
    public static Collection<Object[]> data(){
      return Arrays.asList(new Object[][] {
          {5,120}
      }) ; 
    }

    private int  num;
    private int factorialResult;
    
    public FactorialTest(int  num,int factorialResult) {
      this.num=num;
      this.factorialResult=factorialResult;
    }
    
   /* @Test
    public void goodFactorial() {
       Factorial factorial = new Factorial();
       assertEquals(factorial.fact(num),factorialResult);
    }*/
}
