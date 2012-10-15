import org.junit.Before;
import org.junit.Test;

import java.lang.Integer;import java.util.ArrayList;
import java.util.Random;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator(GenerateRandom());
    }

    private Random GenerateRandom() {
        return new Random() {
            public int nextInt() {
                return 6;
            }
        };
    }

    @Test
    public void test2Plus2() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testOnePlusTwoEqualsThree() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        assertEquals(calculator.add(numbers), 3);
    }

    @Test
    public void testTwoPlusTwoEqualsFour() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(2);
        assertEquals(calculator.add(numbers), 4);
    }

    @Test
    public void testTwoPlusTwoPlusTwoEqualsSix() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        assertEquals(calculator.add(numbers), 6);
    }

    @Test
    public void testThreePlusTwoPlusTwoEqualsSeven() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);
        assertEquals(calculator.add(numbers), 7);

    }

    @Test
    public void testThreeMultipliedByFourEqualsTwelve() {
        assertEquals(calculator.multiply(3, 4), 12);
    }

    @Test
    public void testFourMultipliedByFourEqualsSixteen() {
        assertEquals(calculator.multiply(4, 4), 16);
    }

    @Test
    public void testRandomMultiplyWithThreeShouldReturnEighteen() {
        assertEquals(18, calculator.multiplyWithRandom(3));
    }
}
