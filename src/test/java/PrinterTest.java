import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){printer = new Printer(40, 10);}

    @Test
    public void hasNumberOfPages(){
        assertEquals(25, printer.printSheets(3, 5));
    }
    @Test
    public void  hasEnoughPaper(){
        assertEquals(true, printer.enoughPaper());
    }

    @Test
    public void  hasNotEnoughPaper(){
        Printer sheets = new Printer(7, 10);
        assertEquals(false, sheets.enoughPaper());
    }

    @Test
    public void tonerAmountReduce(){
        assertEquals(9, printer.reduceTonerVolume(1));
    }

//test
    public void amountReduce(){
        assertEquals(9, printer.reduceToner());
    }
}
