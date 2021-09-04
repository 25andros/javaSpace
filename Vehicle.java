/**
 * Vehicle.java This class defines a Vehicle. It stores information for the
 * manufacturer, number of cylinders, and owner information.
 */
public class Vehicle {
   private String manufacturer;
   private Person owner;
   private int cylinders;

   public Vehicle() {

   }

   /**
    * Argument constructor
    * 
    * @param man       (String) - manufacturer of this Vehicle
    * @param cylinders (int) - number of cylinders in this Vehicle
    * @param owner     (Person) - owner of this Vehicle
    */
   public Vehicle(String manufacturer, int cylinders, Person owner) {
      // ITP 220 - complete this method
   }

   /**
    * Copy constructor
    * 
    * @param theObject (Vehicle) - object whose attributes will be used to create
    *                  this new Vehicle instance
    */
   public Vehicle(Vehicle other) {
      // ITP 220 - complete this method
   }

   /**
    * Method to print the attributes of this Vehicle instance
    * 
    * @return (String) - user displayable String describing this Vehicle
    */
   public String toString() {
      // ITP 220 - complete this method
      return ("Vehicle objects:");
   }

   /**
    * Equals method to compare this Vehicle to another Object.
    * 
    * @param other - Object being compared to 'this'
    * @return - TRUE if other contains the same information as 'this'
    */
   public boolean equals(Vehicle voiture) {
      if (owner == voiture.owner) {
         return true;
      } else {
         return false;
      }
      // ITP 220 - complete this method
   }

   public String getManufacturer() {
      return manufacturer;

   }

   public void setManufacturer(String man) {
      manufacturer = man;
   }

   public int getCylinders() {
      return cylinders;

   }

   public void setCylinders(int cylinders) {
      this.cylinders = cylinders;

   }

   public Person getOwner() {
      return owner;
      // ITP 220 - complete this method
   }

   public void setOwner(Person owner) {
      // ITP 220 - complete this method
      // remember should not maintain a reference to the owner passed in
   }
}
