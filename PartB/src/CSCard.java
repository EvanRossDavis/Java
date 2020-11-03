import java.util.Scanner;

/**************************************
 *  describe this class here
 *
 * @author - Evan Davis
 * @version - 06/09/2018 
 *************************************/
public class CSCard 
{

   /********************************************
    * createStatement does the work of producing the
    * CC statement
    ********************************************/
   public void createStatement()
   {
   
      // add any needed constants here
      
      // variables
      Scanner keyboard;
      Scanner keyboard2;
      
      double priorBalance = 0.0;
      double addtlCharges = 0.0;
      double interest = 0.0;
      double newBalance = 0.0;
      double minPayment = 0.0;
   
      // add any needed variables here
      boolean isNum = false;
      boolean isNum2 = false;
      keyboard = new Scanner(System.in);
      keyboard2 = new Scanner(System.in);
      
      System.out.print("Type the balance: ");
      
      do {
    	  if (keyboard.hasNextDouble()) {
    		  priorBalance = keyboard.nextDouble();
    		  isNum = true; 
    	  }
    	  else {
    		  System.out.print("Enter a valid selection ");
    		  isNum = false;
    		  keyboard.next();
    	  }	  
	} while (!isNum);

      
    
      // make sure that the number entered is a double
      // and if so read it in.
      // if not remove the text from the input stream and then
      // use a default value of zero.  No error message to the user.
                     
      System.out.print("Type the new charge amount: ");
      
      do {
    	  if (keyboard2.hasNextDouble()) {
    		  addtlCharges = keyboard2.nextDouble();
    		  isNum2 = true; 
    		   
    	  }
    	  else {
    		 addtlCharges = 0;
    		 break;
    	  }	  
	} while (!isNum2);
      
            
      // make sure that the number entered is a double
      // and if so read it in.
      // if not remove the text from the input stream and then
      // use a default value of zero.  No error message to the user
      // consider whether you want to make this a method?
      
      
      // Perform the calculation of interest, new balance and minimum payment
      interest = calculateInterest(priorBalance, addtlCharges);
      newBalance = priorBalance + addtlCharges + interest;
      minPayment = calculateMinPayment(newBalance);
                    
      // Output the resulting statement (do not change)
      System.out.println("\n\nCS CARD International Statement");
      System.out.println("===============================");
      System.out.printf("Previous balance:   $%,8.2f\n", priorBalance);
      System.out.printf("Additional charges: $%,8.2f\n", addtlCharges);
      System.out.printf("Interest:           $%,8.2f\n\n", interest);
      System.out.printf("New balance:        $%,8.2f\n\n", newBalance);
      System.out.printf("Minimum payment:    $%,8.2f\n", minPayment);
   
   }
   
   /**
    *  calculateInterest - This method will take in the previous balance
    *  and additional charges and compute the amount of interest. 
    *  If the priorBalance is 0 or less, the interest is 0. 
    *  If there was a priorBalance, the interest is 2% of the priorBalance 
    *  plus the additional charges. 
    *
    * @param priorBalance The balance before the new charges are added
    * @param additionalCharges The charges added this month
    *
    * @return The amount of interest to charge
    */
    public double calculateInterest(double priorBalance, double additionalCharges)
    {	//double interest = 0.0;
    	if(priorBalance > 0)
    		return (priorBalance + additionalCharges) * 0.02;
    	else
    		return 0;
    		
       // make me - first create a stub and get the input and output working, 
      // then create fill in the calculation
    	//return interest;
    }
    
    /**
    *  calculateMinPayment - This method will take in the previous balance
    *  and additional charges and compute the minimum payment.
    *  
    *       $0.00             for a new balance less than $0
    *    new balance          for a new balance between $0 and $49.99 (inclusive)
    *      $50.00             for a new balance between $50 and $300 (inclusive)
    * 20% of the new balance  for a new balance over $300
    *
    * @param balance The balance after INTEREST AND CHARGES are added
    *
    * @return The minimum payment amount
    */
    public double calculateMinPayment(double balance)
    {	//double minPayment = 0.0;
    if (balance < 0)
    return 0;
    
    else if (balance >= 0 && balance <= 49.99)
    return balance;
   
    else if (balance >= 50 && balance <= 300)
    		return 50;
    else 
    	return .2 * balance;
       // make me - first create a stub and get the input and output working, 
      // then fill in the calculation
    }

}