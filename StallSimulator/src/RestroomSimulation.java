import java.util.Scanner;
import java.util.Arrays;
/**
      Print diagrams of restroom stalls as they are occupied.
      The premise is that people generally prefer to maximize
      their distance from already occupied stalls, by occupying
      the middle of the longest sequence of unoccupied places.
*/
public class RestroomSimulation
{
   public static void main(String[] args)
   {
	    
	    System.out.print("Enter number of stalls ");
	    Scanner in = new Scanner(System.in);
	    
	    int STALLS = in.nextInt();
	    
	    while (STALLS < 5 || STALLS > 30) {
	    	System.out.println("INVALID! \n"
	    			+ "Enter number of stalls");
	    	STALLS = in.nextInt();	
	    }
	    
	    Restroom wc = new Restroom(STALLS);

	      for (int i = 1; i <= STALLS; i++)
	      {
	         wc.addOccupant();
	         System.out.println(wc.getStalls());
	      }
  
   }
}
