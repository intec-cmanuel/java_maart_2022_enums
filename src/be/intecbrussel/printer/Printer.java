package be.intecbrussel.printer;

public class Printer {
    private PrinterStatus printerStatus;

    public Printer(PrinterStatus printerStatus) {
        this.printerStatus = printerStatus;
    }

    public void print(String text) {
        System.out.println("Attempting to print...");

//        if (printerStatus.equals(PrinterStatus.READY)) {
//            System.out.println("Printing...");
//            System.out.println(text);
//            System.out.println("Done printing...");
//
//        } else if (printerStatus.equals(PrinterStatus.BUSY)) {
//            System.out.println("Printer is busy, please wait...");
//
//        } else if (printerStatus.equals(PrinterStatus.BROKEN)){
//            System.out.println("The printer is broken. Please fix it.");
//        }

        switch (printerStatus) {
            case READY:
                System.out.println("Printing...");
                System.out.println(text);
                System.out.println("Done printing...");
                break;
            case BUSY:
                System.out.println("Printer is busy, please wait...");
                break;
            case BROKEN:
                System.out.println("The printer is broken. Please fix it.");
                break;
        }
    }
}
