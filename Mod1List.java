public class Mod1List extends andria {

    public void gate() {
        boolean repeat = true;
        do {
            flipSwitch();
            repeat = rBoole("\nT|F to Repeat:");
        } while (repeat);
    }

    public void flipSwitch() {

        pTextln("\t<SWITCH>\n");
        int choice = rInt("Input which prob you'd like:");

        switch (choice) {
            case 0:
                probQ();
                break;
            case 1:
                P1 rect = new P1(50, 150);
                rect.DriverCode();
                // Probs rect = new Probs(50, 150);
                // rect.prob1();
                break;
            case 2:
                Prob2 vend = new Prob2();
                vend.DriverCode();
                break;
            case 3:
                P3 gps = new P3();
                gps.DriverCode();
                break;
            case 4:

                break;
            case 5:

                break;
            default:
                break;
        }
        pTextln("\t</SWITCH>\n");
    }

    public void probQ() {
        // the calculation of problem#1
        // Chapter 5, Problem #24
        int prob = 0;
        int id = 7607549;
        int ch = id % 3 + 1;

        if (ch == 5) {
            prob = id % 46 + 1;
        }

        if (ch == 4) {
            ch = 6;
            prob = id % 38 + 1;
        }
        if (ch == 3) {
            prob = (id % 34) + 1;
        }
        System.out.println("The Problem is: " + ch + "\nand the problem is " + prob);
    }
}
