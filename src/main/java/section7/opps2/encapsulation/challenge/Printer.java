package section7.opps2.encapsulation.challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    /***
     * Constructor for Printer class
     * @param tonerLevel: integer
     * @param duplex: boolean
     */
    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    /***
     * Method to add ink in the printer
     * @param tonerAmount: integer
     * @return: integer
     */
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    /***
     * Method to print pages
     * @param pages: integer
     * @return: integer
     */
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.tonerLevel > 0 && this.pagesPrinted < 400) {
            if (this.duplex) {
                this.tonerLevel -= pagesToPrint / 400;
                pagesToPrint = (pages / 2) + (pages % 2);
                System.out.println("Printing in duplex mode");
            }
            this.tonerLevel -= (pagesToPrint * 100) / 400;
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        } else {
            System.out.println("Not sufficient ink to print pages, need to fill ink!");
            return 0;
        }
    }

    // Getter
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
