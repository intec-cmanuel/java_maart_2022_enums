package be.intecbrussel.printer;

public class DemoApp {
    public static void main(String[] args) {
        Printer readyPrinter = new Printer(PrinterStatus.READY);
        Printer busyPrinter = new Printer(PrinterStatus.BUSY);
        Printer brokenPrinter = new Printer(PrinterStatus.BROKEN);

        readyPrinter.print("Hello");
        busyPrinter.print("Hello");
        brokenPrinter.print("hello");
    }
}
