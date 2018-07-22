package junit_Square;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SquareTest {

	 @Parameters
	    public static Collection<Object[]> data(){
	      
	    	return Arrays.asList(new Object[][] {
	          {100,true} }) ; 
	    }
	    
	
	private int  expected ;
	private boolean isTrue;
	
	public SquareTest(int expected, boolean isTrue){	
		this.expected=expected;	
		this.isTrue=isTrue;
	}
	
	@Test
	public void goodSquare() {
		 int x1=0;
		 int y1=10;
		 int x2=10;
		 int y2=0;
		
		Point topLeft = new Point(x1, y1);
		Point downRight = new Point(x2, y2);
		
		Square s = new Square(topLeft, downRight);
	
		int actual= s.getArea();
		
		assertEquals(expected,actual);
		
	}
}


