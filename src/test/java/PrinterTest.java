import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){printer = new Printer(40);}

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
        Printer sheets = new Printer(7);
        assertEquals(false, sheets.enoughPaper());
    }

}
