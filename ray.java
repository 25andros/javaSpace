public class ray {
    public static void main(String[] args) {

        andria hgh = new andria();

        boolean repeat = true;
        do {
            hgh.flipSwitch();
            repeat = hgh.rBoole("\nT|F to Repeat:");
        } while (repeat);
    }

}