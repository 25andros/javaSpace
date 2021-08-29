
public class Truck extends DriverCode {

    private String manuf;
    private Integer passengers;
    private Person owner;
    private double LoadMax;
    private Integer TowMax;

    // public Truck() {
    // manuf = null;
    // passengers = 1;
    // owner = null;
    // LoadMax = 0.00;
    // TowMax = 0;
    // }
    public Truck() {
    }

    public Truck(Truck empty) {
    }

    public Truck(String brand, int NumPeople, Person person, Double Load, Integer Tow) {
        manuf = brand;
        passengers = NumPeople;
        this.owner = person;
        LoadMax = Load;
        TowMax = Tow;
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
    }
}