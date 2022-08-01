import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(80);
    }

    @Test
    public void canPrintWithEnoughPapers() {
        printer.print(5, 3);
        assertEquals(65, printer.sheetsLeft);
    }

    @Test
    public void wontPrintNotEnoughPapers() {
        printer.print(40, 10);
        assertEquals(80, printer.sheetsLeft);
    }

    @Test
    public void willTonerReduceAfterPrint() {
        printer.print(5, 4);
        assertEquals(80, printer.toner);
    }
}
