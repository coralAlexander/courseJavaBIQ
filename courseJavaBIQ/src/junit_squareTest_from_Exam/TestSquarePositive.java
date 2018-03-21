package junit_squareTest_from_Exam;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
   
public class TestSquarePositive {
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
            new Object[][] {
                {10, 10, 20, 20, 100, 40},
                {10, 20, 20, 21, 10, 22}
            }
        );
    }
    
    private Square s;
    private double area;
    private double perimeter;
    
    TestSquarePositive(int x1, int y1, int x2, int y2, double area, double perimeter) {
        this.s = new Square(new Point(x1, y1), new Point(x2, y2));
        this.area = area;
        this.perimeter = perimeter;
    }
    
    @Test
    void testSquareArea() {
        assertEquals(area, s.getArea(),3);
    }

	@Test
    void testSquarePerimeter() {
        assertEquals(perimeter, s.getPerimeter(),3);
    }

}


   