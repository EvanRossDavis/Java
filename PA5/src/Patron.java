/**
 * Represnts a patron in a library.
 * 
 * @author Farzana Rahman
 * @author Chris Mayfield
 * @version 11/28/2016
 */
public class Patron {
    
    private String name;
    
    private String email;
    
    private int idNumber;
    
    private double balance;
    
    /**
     * Constructs a Patron from the given values.
     * 
     * @param name first and last name
     * @param email patron's email address
     * @param idNumber library card number
     * @param balance amount due for patron
     */
    public Patron(String name, String email, int idNumber, double balance) {
        this.name = name;
        this.email = email;
        this.idNumber = idNumber;
        this.balance = balance;
    }
    
    /**
     * Increases/decreases balance by the given amount.
     * 
     * @param amount the fine or payment amount
     * @return the adjusted balance
     */
    public double adjustBalance(double amount) {
        this.balance += amount;
        return this.balance;
    }
    
    /**
     * Compares this patron to the specified object.
     * 
     * @param other the object to compare this Patron against
     * @return true if the patrons have the same id number
     */
    public boolean equals(Object other) {
        boolean result = false;
        if (other instanceof Patron) {
            Patron patron = (Patron) other;
            result = this.idNumber == patron.idNumber;
        } else if (other instanceof Integer) {
            Integer id = (Integer) other;
            result = this.idNumber == id;
        }
        return result;
    }
    
    /**
     * @return the basic info of the Patron as a String
     */
    public String toString() {
        return String.format("Name: %s, Email: %s, ID: %d, Balance: $%.2f.",
                             name, email, idNumber, balance);
    }
    
}
