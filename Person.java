public class Person extends DriverCode {
   private String name;

   public Person() {
      name = null;
   }

   /**
    * Argument constructor
    * 
    * @param theName (String) - name for this Person
    */
   public Person(String theName) {
      // ITP 220 - complete this method
   }

   /**
    * Copy constructor
    * 
    * @param other (Person) - object whose attributes will be used to create this
    *              new Person instance
    */
   public Person(Person other) {
      // ITP 220 - complete this method
   }

   /**
    * @return (String) - user displayable String describing this Person
    */
   public String toString() {

   }

   /**
    * Equals method to compare this Person to another Object.
    * 
    * @param other - Object being compared to 'this'
    * @return - TRUE if other contains the same information as 'this'
    */
   public boolean equals(Object other) {
      // ITP 220 - complete this method
   }

   public String getName() {
      return name;
      // ITP 220 - complete this method
   }

   public void setName(String theName) {
      name = rStr("What is the name of the person?");
   }
}
