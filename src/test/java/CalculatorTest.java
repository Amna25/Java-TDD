
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before() {calculator = new Calculator();}

    @Test
    public void canAddNumber(){
        assertEquals(15, calculator.addNumbers(10,5));
    }

    @Test
    public void canSubtractNumber(){
        assertEquals(5, calculator.subtractNumbers( 10,  5));
    }

    @Test
    public void canDivideNumber(){
        assertEquals(4.2,calculator.divideNumbers(10.5, 2.5),0.0);
    }
    @Test
    public void canMultiplyNumber(){
        assertEquals(6, calculator.multiplyNumbers(2,3));
    }


        };





