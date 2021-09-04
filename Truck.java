
public class Truck extends Vehicle {

    private String manuf;
    private Integer passengers;
    private Person owner;
    private double LoadMax;
    private Integer TowMax;

    public Truck() {
        manuf = null;
        passengers = 1;
        owner = null;
        LoadMax = 1000;
        TowMax = 7000;
    }
    // public Truck() {
    // }

    public Truck(Truck empty) {
    }

    public Truck(String brand, int NumPeople, Person person, Double Load, Integer Tow) {
        manuf = brand;
        passengers = NumPeople;
        this.owner = person;
        LoadMax = Load;
        TowMax = Tow;
    }

    public String toString() {
        // System.out.println(manuf + "\n" + passengers + "\n" + owner + "\n" + LoadMax
        // + "\n" + TowMax);
        return (manuf + ", " + passengers + ", " + owner + ", " + LoadMax + ", " + TowMax);
        // return ("Instantiate new truck object");
        // return ("The truck called " + manuf + " owned by " + owner);
    }

    public void setLoadCap(double value) {
        LoadMax = value;
    }

    public void setTowingCap(Integer value) {
        TowMax = value;
    }

    public Double getLoadCap() {
        return LoadMax;
    }

    public Integer getTowingCap() {
        return TowMax;
    }

    public void setOwner(Person person) {
        owner = person;
    }

    public boolean equals(Truck xyz) {
        if (owner == xyz.owner) {
            return true;
        } else {
            return false;
        }
    }

    public void listAll() {
    }
}