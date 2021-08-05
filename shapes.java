import java.math.*;

public class shapes extends andria {

    private double radius;
    private double height;
    private double volume;
    private double SurfaceArea;

    /*
     * IT's a cylinder!!!
     * 
     */
    public shapes() {
        height = 4.5;
        radius = 2;
        volume = Math.PI * Math.pow(radius, 2) * height;
        SurfaceArea = (Math.PI * Math.pow(radius, 2)) * 2 + (2 * Math.PI * height);

    }

    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return SurfaceArea;
    }

    public void drivercode() {
        pTextln("The Volume of the shape is: " + getVolume());
        pTextln("The Surface Area of the shape is: " + getSurfaceArea());
    }

}