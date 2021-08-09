class last extends andria {
    private int[] sampleRay;
    private int qt;
    private int evenSum;
    private int oddSum;

    public last() {
        qt = 6;
        sampleRay = new int[qt];
    }

    public void p1() {
        // chooseElements();
        initaliseRandArray(sampleRay);
        displayArrayEle();
        pTextln("All elements");
        displayArray(sampleRay);
        pTextln("All Even elements");
        displayEvenArray(sampleRay);

        pTextln("Elements display in reverse order");
        displayReverseArray(sampleRay);

        pTextln("First and last element");
        pTextln(sampleRay[0] + " " + sampleRay[sampleRay.length - 1]);

        pTextln("Total");
        sumArray(sampleRay);

        oEvenArray(sampleRay);
        pTextln("Sum of Evens: " + evenSum);

        oOddArray(sampleRay);
        pTextln("Sum of Odds: " + oddSum);

        pTextln("The sum of evens less the sum of odds: " + (evenSum - oddSum));

    }

    public void chooseElements() {
        qt = rInt("How many elements would you like?");
    }

    public void displayArrayEle() {
        pTextln("The number of elements in the array is: " + qt);
    }

    public void oEvenArray(int[] alpha) {
        int sum = 0;
        for (int index = 0; index < alpha.length; index++) {
            if (index % 2 == 0) {
                sum = sum + alpha[index];
                // pTextln(alpha[index] + "\tis the value @:" + (index));
            }
        }
        evenSum = sum;
    }

    public void oOddArray(int[] alpha) {
        int sum = 0;
        for (int index = 0; index < alpha.length; index++) {
            if (index % 2 == 1) {
                sum = sum + alpha[index];
                // pTextln(alpha[index] + "\tis the value @:" + (index));
            }
        }
        oddSum = sum;
    }

    public void displayEvenArray(int[] alpha) {
        for (int index = 0; index < alpha.length; index++) {
            if (index % 2 == 0) {
                pTextln(alpha[index] + "\tis the value @:" + (index));
            }
        }
    }

    public void displayReverseArray(int[] alpha) {
        for (int index = alpha.length; index > 0; index--) {
            pTextln(alpha[index - 1] + "\tis the value @:" + (index - 1));
        }
    }

    public void reverse(int[] alpha) {
        for (int index = 0; index < alpha.length; index++) {

        }

    }
}