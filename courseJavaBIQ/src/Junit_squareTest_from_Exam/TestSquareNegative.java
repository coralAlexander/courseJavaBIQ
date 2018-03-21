package Junit_squareTest_from_Exam;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestSquareNegative {
  
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
            new Object[][] {
                {10, 10, 2, 20},
                {10, 20, 20, 2}
            }
        );
    }

    private Point p1;
    private Point p2;
    
    TestSquareNegative(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    @Test(expected = Exception.class)
    void testIllegalSquare() {
        new Square(p1, p2);
    }
}
