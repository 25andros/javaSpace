import java.util.Random;
import java.util.Scanner;

//andria is intended to be used as broad use anywhere modules

public class andria {

    public andria() {
    }

    public void flipSwitch() {
        acre holy = new acre();

        pTextln("\t<SWITCH>\n");
        int choice = rInt("Input which prob you'd like:");

        switch (choice) {
            case 1:
                holy.dialogue();
                break;
            case 2:
                break;
            case 3:

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

    public String rStr(String alpha) {
        pTextln(alpha);
        Scanner stdin = new Scanner(System.in);
        return stdin.nextLine();
    }

    public char rChar(String alpha) {
        pTextln(alpha);
        Scanner stdin = new Scanner(System.in);
        return stdin.next().charAt(0);
    }

    public Integer rInt(String a) {
        pTextln(a);
        Scanner stdin = new Scanner(System.in);
        int alpha = stdin.nextInt();
        return alpha;
    }

    public Boolean rBoole(String a) {
        pTextln(a);
        Scanner stdin = new Scanner(System.in);
        boolean alpha = stdin.nextBoolean();
        // stdin.close();
        return alpha;
    }

    public void pTextln(String a) {
        System.out.print(a + "\n");
    }

    public void pText(String a) {
        System.out.print(a + "");
    }

    public Double rDouble(String a) {
        System.out.print(a);
        Scanner stdin = new Scanner(System.in);
        return stdin.nextDouble();
    }

    public void initaliseArray(double[] alpha) {

        for (int index = 0; index < alpha.length; index++) {

            alpha[index] = rDouble("Input value\t:");
        }
    }

    public void initaliseArray(int[] alpha) {
        for (int index = 0; index < alpha.length; index++) {
            alpha[index] = rInt("Input value\t:");
        }
    }

    public void initaliseRandArray(int[] alpha) {
        Random rand = new Random();
        for (int index = 0; index < alpha.length; index++) {
            alpha[index] = rand.nextInt(12) + 1;
        }
    }

    public void displayArray(int[] alpha) {
        for (int index = 0; index < alpha.length; index++) {
            pTextln(alpha[index] + "\tis the value @:" + (index + 1));
        }
    }

    public void displayArray(String[] alpha) {
        for (int index = 0; index < alpha.length; index++) {
            pTextln(alpha[index] + "\tis the value @:" + (index + 1));
        }
    }

    public Integer sumArray(int[] alpha) {
        int total = 0;
        for (int index = 1; index < alpha.length; index++) {
            total += alpha[index];
        }
        return total;

    }

    public double rMax(double[] alpha) {
        double fat;

        fat = alpha[0];
        for (int index = 1; index < alpha.length; index++) {
            if (alpha[index] > fat) {
                fat = alpha[index];
            }
        }
        return fat;
    }

    public double rMin(double[] alpha) {
        double smallest;

        smallest = alpha[0];
        for (int index = 1; index < alpha.length; index++) {
            if (alpha[index] < smallest) {
                smallest = alpha[index];
            }
        }
        return smallest;
    }

    public Integer rMax(int[] alpha) {
        int fat;

        fat = alpha[0];
        for (int index = 1; index < alpha.length; index++) {
            if (alpha[index] > fat) {
                fat = alpha[index];
            }
        }
        return fat;
    }

    public Integer rMin(int[] alpha) {
        int smallest;

        smallest = alpha[0];
        for (int index = 1; index < alpha.length; index++) {
            if (alpha[index] < smallest) {
                smallest = alpha[index];
            }
        }
        return smallest;
    }
}
