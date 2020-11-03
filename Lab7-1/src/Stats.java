/**
 * Utility methods for calculating statistics.
 * 
 * @author Farzana Rahman
 * @version 10/17/2017
 *
 */
public class Stats {

   /**
    * Calculate the mean of a collection of doubles.
    * 
    * @param numbers - The array of doubles
    * @return The mean, or Double.NaN if the array is empty or null
    */
   public static double mean(double[] numbers) {
      double total = 0;
      double result;
      
      if (numbers == null || numbers.length == 0) {
         result = Double.NaN;
      } else {

         for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
         }
         result = total / numbers.length;
      }
      return result;
   }

   /**
    * Calculate the standard deviation of a collection of doubles.
    * 
    * @param numbers - The array of doubles
    * @return The standard deviation, or Double.NaN if the array is empty or
    *         null
    */
   public static double stdDev(double[] numbers) {
      double mean;
      double total = 0;
      double result;
      
      if (numbers == null || numbers.length == 0) {
         result = Double.NaN;
      } else {
         mean = mean(numbers);
         for (int i = 0; i < numbers.length; i++) {
            total += Math.pow((mean - numbers[i]), 2);
         }
         result = Math.sqrt(total / numbers.length);
      }
      return result;
   }

}
