import java.util.Scanner;

public class DriverCode {
   public static void main(String[] args) {
      testPerson();
      System.out.println("");
      testVehicle();
      System.out.println("");
      testTruck();
   }

   public void pTextln(String a) {
      System.out.print(a + "\n");
   }

   public String rStr(String alpha) {
      pTextln(alpha);
      Scanner stdin = new Scanner(System.in);
      return stdin.nextLine();
   }

   public static void testPerson() {
      Person p1 = new Person();
      System.out.println("p1: " + p1);

      // test setName() accessor method
      p1.setName("Bob Evans");
      System.out.println("p1's name is: " + p1.getName());

      // test argument constructor to create "Joe Schmoe"
      Person p2 = new Person("Joe Schmoe");
      System.out.println("p2: " + p2);

      // test copy constructor on an empty Person
      Person empty = null;
      Person p3 = new Person(empty);
      System.out.println("Empty person is: " + p3);

      // test copy constructor to create another "Bob Evans"
      Person p4 = new Person(p1);
      p4.setName(null); // test that empty parameter is ignored
      System.out.println("p4: " + p4);

      // test equals methods
      System.out.println("p4 equal to p1: " + p4.equals(p1)); // should be true
      System.out.println("p2 equal to p1: " + p2.equals(p1)); // should be false
   }

   public static void testVehicle() {
      // test empty constructor
      Vehicle v1 = new Vehicle();
      System.out.println("v1: " + v1);

      // test accessor methods on empty Vehicle
      System.out.println(" -- v1's manufacturer is: " + v1.getManufacturer());
      System.out.println(" -- v1's cylinders: " + v1.getCylinders());
      System.out.println(" -- v1's owner is: " + v1.getOwner());

      // populate attributes and test accessor methods on populated Vehicle
      v1.setManufacturer("Ford");
      v1.setCylinders(4);
      v1.setOwner(null); // test that empty parameter is ignored
      v1.setOwner(new Person("Joe Schmoe"));
      System.out.println("v1 is now: " + v1);
      System.out.println(" -- v1's manufacturer is: " + v1.getManufacturer());
      System.out.println(" -- v1's cylinders: " + v1.getCylinders());
      System.out.println(" -- v1's owner is: " + v1.getOwner());

      // test argument constructor to create Marie's Chevy
      Vehicle v2 = new Vehicle("Chevy", 4, new Person("Marie Callendar"));
      System.out.println("v2: " + v2);

      // test copy constructor on an empty Vehicle
      Vehicle empty = null;
      Vehicle v3 = new Vehicle(empty);
      System.out.println("Empty vehicle is: " + v3);

      // test copy constructor to create another one of Joe's Fords
      Vehicle v4 = new Vehicle(v1);
      System.out.println("v4: " + v4);

      // test equals methods
      System.out.println("v4 equal to v1: " + v4.equals(v1)); // should be true
      System.out.println("v2 equal to v1: " + v2.equals(v1)); // should be false
   }

   public static void testTruck() {
      // test empty constructor
      Truck t1 = new Truck();
      System.out.println("t1: " + t1);

      t1.setLoadCap(54.36);
      t1.setTowingCap(10);
      System.out.println("t1's load capacity is: " + t1.getLoadCap());
      System.out.println("t1's towing capacity is: " + t1.getTowingCap());

      // Truck t2 = new Truck("Chevy", 4, "Betty Davis", 34.5, 65);
      Truck t2 = new Truck("Chevy", 4, new Person("Betty Davis"), 34.5, 65);
      System.out.println("t2: " + t2);

      Truck empty = null;
      Truck t3 = new Truck(empty);
      System.out.println("Empty Truck is: " + t3);

      // Truck t4 = new Truck(t1);
      Truck t4 = t1;
      System.out.println("t4: " + t4);

      System.out.println("t4 equal to t1: " + t4.equals(t1)); // should be true

      t4.setOwner(new Person("Clive Davis"));
      System.out.println("t4: " + t4);

      // retest the equals() method
      System.out.println("t4 equal to t1: " + t4.equals(t1)); // should be false

      // test the equals method on a Vehicle and a Truck
      Vehicle v1 = new Vehicle("Ford", 8, null);
      Truck t5 = new Truck("Ford", 8, null, 75.0, 150);
      System.out.println("t5 equal to v1: " + t5.equals(v1)); // should be false because
                                                              // the "is a" relationship
                                                              // states that a Truck is a
                                                              // Vehicle, but not vice-versa.
   }
}
