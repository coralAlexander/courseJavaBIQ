package junit_Parametrized_Class;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibinacciTest {

    @Parameters
    public static Collection<Object[]> data(){
      return Arrays.asList(new Object[][] {
          {2,true}  
      }) ; 
    }

    private int  num1;
  
    private boolean isPrime;
    
    public FibinacciTest(int  num1,boolean isPrime) {
      this.num1=num1;
      this.isPrime=isPrime;
    }
    
    @Test
    public void goodPrimeNumbers() {
        PrimeNumber prime = new PrimeNumber();
        assertEquals(prime.ifNumberIsPrime(num1),isPrime);
    }
}
