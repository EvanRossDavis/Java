import java.util.Scanner;

/**
 * This program reads some numbers from the terminal and calculates their mean
 * and standard deviation.
 * 
 * @author Farzana Rahman
 * @version 10/17/2017
 *
 */
public class StatDriver {

   /**
    * Reads numbers and prints their mean and standard deviation to the
    * terminal.
    * 
    * @param args - args[0] should contain the number of values that will be
    *           read, 15 is the default if no command line argument is provided
    */
   public static void main(String[] args) {

      int number;
      char letter;
      
      if (args.length>1) {
    	  number = Integer.parseInt(args[0]);
    	  letter = args[1].charAt(0);
    	  
    	  for (int ii = number; ii >=0; ii--) {
    		  System.out.print(letter);
    	  }
    	  System.out.println();
      }
      else
    	  System.out.println("Invalid input");
   }

}
