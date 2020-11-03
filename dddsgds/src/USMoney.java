/**
 * a class to represent US Money values
 *
 * @author - YOUR NAME
 * @version - 1.0 - DATE
 */
public class USMoney {
  
   
   // FIELDS HERE
   
   /**
    * Default constructor, sets this USMoney to $0.00
    */
   // METHOD HERE

   /**
    * Explicit value constructor. If the cents are > 99 adjust the dollars and
    * cents accordingly (ie. 101 cents would be 1 dollar and 1 cent.
    * 
    * If either of the values is < 0 set the corresponding value to zero.
    *
    * HINT: Read the entire class before doing this method.
    *
    * @param dollars - the dollar value
    * @param cents - the cents value
    */
     // METHOD HERE

   /**
    * the adjust method adjusts this object's dollars and cents based on the
    * number of cents. If cents is greater than 99, it will increase the dollars
    * and reduce the cents accordingly. HINT: Work out some examples first.
    */
  // METHOD HERE

   /**
    * getDollars returns only the number of dollars associated with this 
    * USMoney object. For example if the object represents $23.15, this 
    * method should return 23.
    * 
    * @return The number of dollars
    */
      // METHOD HERE
   
   
   /**
    * getCents returns only the number of cents associated with this USMoney 
    * object. For example if the object represents $23.15, this method 
    * should return 15.
    * 
    * @return The number of cents
    */
  // METHOD HERE

   /**
    * getTotalCents gets the total number of cents in this USMoney object. For
    * example, 3 dollars and 5 cents would return 305
    * 
    * @return The number of cents in this money object.
    */
  // METHOD HERE

   /**
    * compare compares this USMoney object to another USMoney object. It returns
    * 1 if this is > than other, 0 if they are the same, -1 if this is less than
    * other.
    * 
    * @param other The USMoney object to compare to this USMoney
    * @return 1 if this > other, 0 if this == other, -1 if this < other
    */
 // METHOD HERE

   /**
    * add creates and returns a new USMoney object that is equal to the sum 
    * of this USMoney object and the provided USMoney object.
    *
    * Neither this object nor the other object should be changed.
    * 
    * For example if this USMoney represented $3.51 and the other object
    * represented $.60, the returned object would represent $4.11.
    * 
    * The returned USMoney object should be properly adjusted. I.e. the number
    * of cents must be less than 100.
    *
    * @param other The other money object to add
    *
    * @return A new USMoney object that is the sum of both objects.
    */
  // METHOD HERE

   /**
    * toString returns a String representation of this USMoney object (It is
    * provided here to use in testing.)
    * 
    * @return A String representing this USMoney object
    */
   public String toString() {
      return String.format("$%d.%d", dollars, cents);
   }

   /**
    * countMoney returns the sum of all USMoney objects in the provided array as
    * a USMoney object.
    * 
    * If the array is empty, countMoney should return a USMoney object
    * representing $0.00. You may assume that the array will not be null.
    * 
    * 
    * The returned USMoney object should be properly adjusted. I.e. the number
    * of cents must be less than 100.
    *
    *
    * @param allMoney An array of USMoney objects.
    * @return A USMoney object representing the sum of all provided money.
    */
   // METHOD HERE
}
