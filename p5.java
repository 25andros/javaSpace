import java.util.Random;

public class p5 extends andria {
    private int[][] stnd = new int[10][10];
    private int row;
    private int col;

    public p5() {
        row = 0;
        col = 0;
    }

    public Integer getRowChoice() {
        return row;
    }

    public Integer getColChoice() {
        return col;
    }

    public void rowChoice() {
        row = rInt("Which Row would you like the total of?");
    }

    public void colChoice() {
        col = rInt("Which Column would you like the total of?");
    }

    // creation of multi-array
    public void makeArray(int[][] stnd) {
        for (int index = 0; index < stnd.length; index++) {
            Random rand = new Random();
            for (int bindex = 0; bindex < stnd[index].length; bindex++) {
                stnd[index][bindex] = rand.nextInt(12) + 1;
                // pText(stnd[index][bindex] + " ");
            }
            // pTextln("");
        }
    }

    public Integer getTotal(int[][] alpha) {
        int total = 0;

        for (int index = 0; index < alpha.length; index++) {
            for (int bindex = 0; bindex < alpha.length; bindex++) {
                total += alpha[index][bindex];
            }
        }
        return total;
    }

    public Integer getRowTotal(int[][] alpha, int row) {
        int total = 0;
        row -= 1;

        for (int bindex = 0; bindex < alpha.length; bindex++) {
            total += alpha[row][bindex];
        }
        return total;
    }

    public Integer getColTotal(int[][] alpha, int col) {
        int total = 0;
        col -= 1;

        for (int bindex = 0; bindex < alpha.length; bindex++) {
            total += alpha[bindex][col];
        }
        return total;
    }

    public Integer getAVG(int[][] alpha) {
        int total = 0;
        int count = 0;

        for (int index = 0; index < alpha.length; index++) {
            for (int bindex = 0; bindex < alpha.length; bindex++) {
                total += alpha[bindex][bindex];
                count += 1;
            }
        }
        return total / count;
    }

    public void pArray(int[][] alpha) {
        for (int index = 1; index < alpha.length; index++) {
            for (int bindex = 1; bindex < alpha.length; bindex++) {
                pText(alpha[index][bindex] + " ");
            }
            pTextln("\tRow: " + index + "");
        }
    }

    public void rMaxPRow(int[][] alpha) {
        int fat = 0;

        for (int index = 0; index < alpha.length; index++) {
            fat = alpha[index][0];
            for (int bindex = 0; bindex < alpha[index].length; bindex++) {
                if (alpha[index][bindex] > fat) {
                    fat = alpha[index][bindex];
                }
            }
            pTextln("The largest number in row# " + index + " was " + fat);
        }
        // return fat;
    }

    public void rMinPRow(int[][] alpha) {
        int fat = 0;

        for (int index = 0; index < alpha.length; index++) {
            fat = alpha[index][0];
            for (int bindex = 0; bindex < alpha[index].length; bindex++) {
                if (alpha[index][bindex] < fat) {
                    fat = alpha[index][bindex];
                }
            }
            pTextln("The smallest number in row# " + index + " was " + fat);
        }
        // return fat;
    }

    public void drivercode() {
        makeArray(stnd);

        pTextln("The array");
        pArray(stnd);

        pTextln("The sum of all elements:\t" + getTotal(stnd) + " ");
        pTextln("");
        pTextln("The average of the elements" + getAVG(stnd));

        rowChoice();
        pTextln("The sum of row #" + getRowChoice() + " is " + getRowTotal(stnd, getRowChoice()));

        colChoice();
        pTextln("The sum of col #" + getColChoice() + " is " + getColTotal(stnd, getColChoice()));

        rMaxPRow(stnd);
        rMinPRow(stnd);
    }
}
