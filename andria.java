import java.util.Random;
import java.util.Scanner;

//andria is intended to be used as broad use anywhere modules

public class andria {

    public andria() {
    }

    public void flipSwitch() {

        pTextln("\t<SWITCH>\n");
        int choice = rInt("Input which prob you'd like:");

        switch (choice) {
            // acre holy = new acre();
            // case 1:
            // holy.dialogue();
            // break;
            case 1:
                Address n1 = new Address();
                Address n3 = new Address();
                pTextln("Address #1 please");
                n1.drivercode();
                pTextln("Address #2 please");
                n3.drivercode();
                pTextln("Now we will comepare which has a smaller Zip.");
                n1.comesBefore(n1.getZip(), n3.getZip());
                pTextln("The two addresses provided were:");
                n1.printVariables();
                n3.printVariables();
                break;
            case 2:
                shapes cyl = new shapes();
                shapes cyl2 = new shapes();
                cyl.drivercode();
                break;
            case 3:
                monthManip alpha = new monthManip(5);
                monthManip beta = new monthManip(2);
                alpha.setMonthName();
                beta.setMonthName();
                pTextln(alpha.getMonthName());
                pTextln(beta.getMonthName());

                pTextln("");
                pTextln(alpha.toString());
                pTextln(beta.toString());
                pTextln("");

                if (alpha.equals(alpha, beta)) {
                    pTextln("The months are equal");
                }

                if (alpha.lessThan(alpha, beta)) {
                    pTextln("The first month is before the second month.");
                }

                if (alpha.greaterThan(alpha, beta)) {
                    pTextln("The second month is before the first month.");
                }

                break;
            case 4:

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
