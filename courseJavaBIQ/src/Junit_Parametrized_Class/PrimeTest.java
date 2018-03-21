package Junit_Parametrized_Class;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeTest {

    @Parameters
    public static Collection<Object[]> data(){
      return Arrays.asList(new Object[][] {
          {2,true},{7,true},{21,false}  
      }) ; 
    }

    private int  num;
    private boolean isPrime;
    
    public PrimeTest(int num, boolean isPrime) {
      this.num=num;
      this.isPrime=isPrime;
    }
    
    @Test
    public void goodPrimeNumbers() {
        PrimeNumber prime = new PrimeNumber();
        assertEquals(prime.ifNumberIsPrime(num),isPrime);
    }
}
