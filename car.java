public class car extends andria {

    private Integer tank;
    private Integer fuel;
    private Integer mpg;

    public car() {
        tank = 20;
        fuel = 0;
        mpg = 30;

    }

    public void addFuel() {
        pTextln("Adding fuel now.\nTopping off the tank.\t");
        fuel = tank;
    }

    public void drive() {
        int distance = rInt("How many miles would you like to go?");
        fuel = fuel - (distance / mpg);
    }

    public void displayfuel() {
        pTextln("The current fuel levels are:" + fuel);
    }

    public void drivercode() {
        displayfuel();
        boolean driveMoreQ = false;
        do {
            pTextln("");
            addFuel();
            displayfuel();
            drive();
            displayfuel();
            driveMoreQ = rBoole("Do you want to drive some more?");
        } while (driveMoreQ);
    }

}