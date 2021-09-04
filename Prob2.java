public class Prob2 extends andria {

    // private double[][] catalogue;
    private String[] catalogueName;
    private double[] cataloguePrice;
    private int[] catalogueQT;
    private int choice;

    private int cashFive;
    private int cashOne;
    private int quarter;
    private double payment;

    // Constuctors

    public Prob2() {
        // catalogue = new double[3][5];
        // setCatalogueName(new String[5]);
        // setCataloguePrice(new double[5]);
        // setCatalogueQT(new int[5]);
        catalogueName = new String[] { "Snickers", "Txix", "Hersey's", "Capitan Crunch", "Cheesecake" };
        cataloguePrice = new double[] { 2.25, 2.5, 1.75, 2.00, 5.5 };
        catalogueQT = new int[] { 5, 5, 0, 5, 2 };
    }

    public void setCatalogueFOOD() {
    }

    // Accessors and mutators

    public Integer getChoice() {
        return choice;
    }

    public int[] getCatalogueQT() {
        return catalogueQT;
    }

    public void setCatalogueQT(int[] catalogueQT) {
        this.catalogueQT = catalogueQT;
    }

    public String[] getCatalogueName() {
        return catalogueName;
    }

    public void setCatalogueName(String[] catalogueName) {
        this.catalogueName = catalogueName;
    }

    public double[] getCataloguePrice() {
        return cataloguePrice;
    }

    public void setCataloguePrice(double[] cataloguePrice) {
        this.cataloguePrice = cataloguePrice;
    }

    public void initaliseCatalogue(double[][] alpha) {
        for (int index = 0; index < alpha.length; index++) {
            for (int bindex = 0; bindex < alpha[index].length; bindex++) {

                alpha[index][bindex] = rDouble("Input value\t:");
            }
        }
    }

    public void showCatalogue(String[] alpha) {
        for (int index = 0; index < alpha.length; index++) {
            pText(alpha[index] + " ");
        }
        pTextln("");
    }

    public void showCatalogue(double[] alpha) {
        for (int index = 0; index < alpha.length; index++) {
            pText("$" + alpha[index] + " ");
        }
        pTextln("");
    }

    public void showCatalogue(int[] alpha) {
        for (int index = 0; index < alpha.length; index++) {
            pText(alpha[index] + " ");
        }
        pTextln("");
    }

    public void selectItem() {
        do {
            choice = rInt("Which Item do you want?");
        } while (choice < 1 || choice > 5);

        choice = choice - 1; // to offset for out-of-bounds
    }

    public void confirmItemCost() {
        pTextln("\nThe details of that item will be:");
        pTextln("Descript:\t" + catalogueName[getChoice()]);
        pTextln("Price:\t\t$" + cataloguePrice[getChoice()]);
        pTextln("Quantity:\t" + catalogueQT[getChoice()]);

        // Prompt user for new item if qt is 0;
        if (catalogueQT[getChoice()] == 0) {
            pTextln("Error!! There is 0 quantity left. Pick another item.");
            selectItem();
            confirmItemCost();
        }
    }

    public void insertCash() {
        pTextln("\nPAYMENT PROCESSING:");
        cashFive = rInt("How many 5 Dollar Bills do you have?");
        cashOne = rInt("How many 1 Dollar Bills do you have?");
        quarter = rInt("How many quarters do you have?");

        payment = 5 * cashFive + cashOne + .25 * quarter;

        pTextln("The cash you provided was:\t$" + payment);

    }

    public void refundAmount() {
        if (payment - cataloguePrice[getChoice()] > 0) {
            pTextln("\nRefund is due:");

            double refund = payment - cataloguePrice[getChoice()];

            pTextln("Here is a refund of:\t$" + refund);

            int refFives, refOnes, refQuarts;

            refFives = (int) (refund / 5);
            refund = refund % 5;

            refOnes = (int) (refund / 1);
            refund = refund - refOnes;
            refQuarts = (int) (refund / .25);

            pTextln("Change being tendered:");
            pTextln("Fives:\t" + refFives);
            pTextln("Ones\t" + refOnes);
            pTextln("Quarters\t" + refQuarts);

        }

    }

    public void updateQT() {
        catalogueQT[getChoice()] = catalogueQT[getChoice()] - 1;
    }

    public void DriverCode() {
        boolean repeat = true;
        do {

            pTextln("");
            setCatalogueFOOD();

            // Shows items on hand
            showCatalogue(getCatalogueName());
            showCatalogue(getCataloguePrice());
            showCatalogue(getCatalogueQT());

            selectItem();
            confirmItemCost();
            insertCash();
            refundAmount();

            updateQT();

            // Display quantity again
            showCatalogue(getCatalogueName());
            showCatalogue(getCataloguePrice());
            showCatalogue(getCatalogueQT());

            repeat = rBoole("\nT|F to get another Item:");
        } while (repeat);
    }
}