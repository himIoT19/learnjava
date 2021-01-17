package section7.opps2.composition.challenge;

public class Ceiling {
    private int height;
    private int paintedColour;

    // Constructor
    public Ceiling(int height, int paintedColour) {
        this.height = height;
        this.paintedColour = paintedColour;
    }

    // Getters
    public int getHeight() {
        return height;
    }

    public int getPaintedColour() {
        return paintedColour;
    }
}
