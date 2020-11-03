/**
 * If-else-if exercises.  Complete the four unfinished methods 
 * below.  Submit the result through Web-CAT.
 * 
 * @author Farzana Rahman and EVAN ROSS DAVIS
 * @version 06/09/2018
 */
public class SnowDayIf {

   /**
    * Return the larger of the two arguments. 
    * 
    * @param a  first integer to compare
    * @param b  second integer to compare
    * @return a or b, depending on which is larger
    */
	
   public static int max2(int a, int b) {
	   //int max;
	   if (a < b)
		   return b;
	   else
		   return a;
      //return max;
   }

   /**
    * Return the larger of the two arguments, or 0 if both arguments are 
    * negative. 
    * 
    * @param a  first integer to compare
    * @param b  second integer to compare
    * @return 0 if both are negative, otherwise a or b
    */
   public static int positiveMax2(int a, int b) {
      // You could simplify this method by calling max2.
	   if(a < 0 || b < 0)
		   return 0;
	   else 
		   return max2(a,b);
   }

   /**
    * Return the largest of the three integer arguments.
    * 
    * @param a first integer to compare
    * @param b second integer to compare
    * @param c third integer to compare
    * @return The largest of the three arguments
    */
   public static int max3(int a, int b, int c) {
	   //int max = a;
	   if (b > a && b > c) return b;
	   if (c > a && c > b) return c;
	   		
	   return a;
   }

   /**
    * Return the largest of the three integer arguments, or 0 if all 
    * arguments are negative. 
    * 
    * @param a first integer to compare
    * @param b second integer to compare
    * @param c third integer to compare
    * @return 0 if all arguments are negative, otherwise the largest 
    *         of the three.
    */
   public static int positiveMax3(int a, int b, int c) {
      // You could simplify this method by calling max3.
	   if(a < 0 || b < 0 || c < 0)
		   return 0;
	   else 
		   return max3(a,b,c);
   }

   /**
    * Tests for the max methods above.  YOU SHOULD NOT NEED TO MODIFY THE MAIN.
    * 
    * @param args Command line arguments.  Not used.
    */
   public static void main(String[] args) {

      int output;

      System.out.println("TESTS FOR max2");
      output = max2(3, 5);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = max2(5, 3);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = max2(-2, -3);
      System.out.printf("Expected: %2d  Actual: %2d\n", -2, output);

      System.out.println("\nTESTS FOR positiveMax2");
      output = positiveMax2(3, 5);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = positiveMax2(5, 3);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = positiveMax2(-2, -3);
      System.out.printf("Expected: %2d  Actual: %2d\n", 0, output);

      System.out.println("\nTESTS FOR max3");
      output = max3(3, 4, 5);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = max3(4, 3, 5);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = max3(3, 5, 4);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = max3(4, 5, 3);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = max3(5, 3, 4);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = max3(5, 4, 3);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = max3(-3, -5, -4);
      System.out.printf("Expected: %2d  Actual: %2d\n", -3, output);

      System.out.println("\nTESTS FOR positiveMax3");
      output = positiveMax3(3, 4, 5);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = positiveMax3(4, 3, 5);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = positiveMax3(3, 5, 4);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = positiveMax3(4, 5, 3);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = positiveMax3(5, 3, 4);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = positiveMax3(5, 4, 3);
      System.out.printf("Expected: %2d  Actual: %2d\n", 5, output);

      output = positiveMax3(-3, -5, -4);
      System.out.printf("Expected: %2d  Actual: %2d\n", 0, output);

   }

}
