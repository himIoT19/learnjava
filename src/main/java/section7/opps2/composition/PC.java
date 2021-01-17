package section7.opps2.composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // Constructor
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixels(1200, 500, "yellow");
    }
}
