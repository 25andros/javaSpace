import java.util.Random;

public class P3 extends andria {

    // instance variables
    private int x, y, mph;

    // Constructor
    public P3() {
        x = 0;
        y = 0;
        setMph(60);
    }

    public P3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters & Setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getMph() {
        return mph;
    }

    public void setMph(int mph) {
        this.mph = mph;
    }

    // OOP portion
    public void NextDirection() {
        Random go = new Random();
        int vector = go.nextInt(3) + 1;

        switch (vector) {
            case 1:// West
                x = x - 1;
                break;
            case 2: // East
                x = x + 1;
                break;
            case 3: // North
                y = y + 1;
                break;
            case 4: // South
                y = y - 1;
                break;
        }
    }

    public String toString() {
        return "(" + x + "," + y + ")";

    }

    public void DriverCode() {
        pTextln("Starting location:\t" + toString());

        for (int time = 0; time <= 60; time++) {
            if (time % 5 == 0) {
                NextDirection();
                pTextln("");
            }
        }

    }
}
