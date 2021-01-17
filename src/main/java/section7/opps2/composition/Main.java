package section7.opps2.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimDell = new Dimensions(20, 25, 10);
        // Case dellCase = new Case("2021A", "Dell", "240", new Dimensions(20, 25, 10));
        Case dellCase = new Case("2021A", "Dell", "240", dimDell);

        Monitor dellMonitor = new Monitor("27inch Beast", "Dell", 27, new Resolution(2540, 1440));

        Motherboard asusMotherboard = new Motherboard("570F", "Asus", 4, 6, "v2.44");

        PC dellPC = new PC(dellCase, dellMonitor, asusMotherboard);

        dellPC.getTheCase().pressPowerButton();
        dellPC.getMotherboard().loadProgram("Ubuntu 20.04 LTS");
        dellPC.getMonitor().drawPixels(1500, 1200, "red");
    }
}
