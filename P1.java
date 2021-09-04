import java.util.Random;

public class P1 {
    int width, height;

    public P1(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void DriverCode() {
        // Problem CH 3, #16
        // (Random point) Write a program that displays a random coordinate in a
        // rectangle.
        // The rectangle is centred at (0, 0) with width 50 and height 150.

        Random rand = new Random();

        int x, y;
        x = rand.nextInt(width);
        y = rand.nextInt(height);

        System.out.println("The x point was :\t" + x);
        System.out.println("The y point was :\t" + y);

    }

}
