public class Printer {
    public int sheetsLeft;
    public int toner;

    public Printer(int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
        this.toner = 100;
    }

    public void print(int pages, int copies) {
        int printed = pages * copies;
        if (printed < sheetsLeft) {
            sheetsLeft -= printed;
            toner -= printed;
        }
    }
}
