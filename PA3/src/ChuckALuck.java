/**
 * Computes the payout for Chuck-a-luck.
 *
 *
 * @author EVAN ROSS DAVIS
 * @version 06/22/18
 */
public class ChuckALuck {

   // Constants that specify bet types
   public static final int SINGLE = 1;
   public static final int TRIPLE = 2;
   public static final int BIG = 3;
   public static final int SMALL = 4;
   public static final int FIELD = 5;

   // Constants that specify payout multipliers
   public static final double SINGLE_ONE_ODDS = 1.0;
   public static final double SINGLE_TWO_ODDS = 2.0;
   public static final double SINGLE_THREE_ODDS = 10.0;
   public static final double TRIPLE_ODDS = 30.0;
   public static final double BIG_ODDS = 1.0;
   public static final double SMALL_ODDS = 1.0;
   public static final double FIELD_ODDS = 1.0;

   /**
    * Calculate the correct Chuck-a-luck payout based on the dice roll, the bet
    * type, and the bet amount.
    * 
    * For any losing roll the payout will be a negative number equal to the
    * value of the bet. For example, on a losing $3.00 bet, the payout will be
    * -$3.00.
    * 
    * @param dice       A dice object representing the outome of the roll
    * @param betType    The type of the bet, SINGLE, TRIPLE, BIG, etc.
    * @param number     The number of the bet, 1-6. (Note that this parameter
    *                   only matters if the bet type is SINGLE. Tt will be 
    *                   ignored for all other bet types.)
    * @param betAmount  The amount of the bet in dollars
    * @return The payout amount in dollars. This will be a negative number if it
    *         was a losing bet.
    */
   public static double calculatePayout(Dice dice, int betType, int number,
   double betAmount) {

      double payout;
      payout = 0;
      
      switch(betType) {
      case SINGLE:
    	  payout = singleBet(dice, betAmount, number);
    	  break;
      case TRIPLE:
    	  payout = tripleBet(dice, betAmount);
    	  break;
      case BIG:
    	  payout = bigBet(dice, betAmount);
      case SMALL:
    	  payout = smallBet(dice, betAmount);
    	  break;
      case FIELD:
    	  payout = fieldBet(dice, betAmount);
    	  break;
      }

      // Write a switch statement to evaluate the payout.
      // Cases that require more than a few lines of code should be handled
      // in separate methods below. Each case should set the value of the
      // payout variable, so that you will have only one return statement.

      return payout;

   }
   
   /**
    * Calculate the correct Chuck-a-luck payout based on the dice roll, the bet
    * amount, and the bet number.
    * 
    * For any losing roll the payout will be a negative number equal to the
    * value of the bet. For example, on a losing $3.00 bet, the payout will be
    * -$3.00.
    * 
    * @param dice       A dice object representing the outome of the roll
    * @param number     The number of the bet, 1-6. (Note that this parameter
    *                   only matters if the bet type is SINGLE. Tt will be 
    *                   ignored for all other bet types.)
    * @param betAmount  The amount of the bet in dollars
    * @return The payout amount in dollars. This will be a negative number if it
    *         was a losing bet.
    */
   public static double singleBet(Dice dice, double betAmount, int number) {
   
	   int one_rolled = 1;
	   int two_rolled = 2;
	   int three_rolled = 3;
	   
	   double payout;
	   if(dice.countValues(number) == one_rolled) {
	   payout = betAmount * one_rolled;
	   }
	   else if(dice.countValues(number) == two_rolled){
	   payout = betAmount * two_rolled;
	   }
	   else if(dice.countValues(number) == three_rolled) {
	   payout = betAmount * three_rolled;
	   }
	   else {
	   payout = -betAmount;
	   }
	
	   		return payout;
	  }
   
   /**
    * Calculate the correct Chuck-a-luck payout based on the dice roll, and the bet amount.
    * 
    * For any losing roll the payout will be a negative number equal to the
    * value of the bet. For example, on a losing $3.00 bet, the payout will be
    * -$3.00.
    * 
    * @param dice       A dice object representing the outome of the roll
    * @param betAmount  The amount of the bet in dollars
    * @return The payout amount in dollars. This will be a negative number if it
    *         was a losing bet.
    */
   public static double tripleBet(Dice dice, double betAmount) {
	   double payout = 0.0;
	   double three_rolled = 3;
	   
	   if(dice.getFirst() == dice.getSecond() && dice.getSecond() == dice.getThird()) 
	   	{ payout = betAmount * three_rolled; }
	   else 
	   	{ payout = -betAmount; } //Optimize this
	   		return payout;
   
   }
   
   /**
    * Calculate the correct Chuck-a-luck payout based on the dice roll, and the bet amount.
    * 
    * For any losing roll the payout will be a negative number equal to the
    * value of the bet. For example, on a losing $3.00 bet, the payout will be
    * -$3.00.
    * 
    * @param dice       A dice object representing the outome of the roll
    * @param betAmount  The amount of the bet in dollars
    * @return The payout amount in dollars. This will be a negative number if it
    *         was a losing bet.
    */
   public static double bigBet(Dice dice, double betAmount) {
	   double payout = 0.0;
	   int one_rolled = 1;
	   
	   if(dice.addValues() >= 11) 
	   	{ payout = betAmount * one_rolled; }
	   else 
	   	{ payout = -betAmount; }
	   		return payout;
   }
   
   /**
    * Calculate the correct Chuck-a-luck payout based on the dice roll, and the bet amount.
    * 
    * For any losing roll the payout will be a negative number equal to the
    * value of the bet. For example, on a losing $3.00 bet, the payout will be
    * -$3.00.
    * 
    * @param dice       A dice object representing the outome of the roll
    * @param betAmount  The amount of the bet in dollars
    * @return The payout amount in dollars. This will be a negative number if it
    *         was a losing bet.
    */
   public static double smallBet(Dice dice, double betAmount) {
	   double payout = 0.0;
	   int one_rolled = 1;
	   
	   if(dice.addValues() <= 10) 
	   	{ payout = betAmount * one_rolled; }
	   else 
	   	{ payout = -betAmount; }
	   return payout;
   }
   
   /**
    * Calculate the correct Chuck-a-luck payout based on the dice roll, and the bet amount.
    * 
    * For any losing roll the payout will be a negative number equal to the
    * value of the bet. For example, on a losing $3.00 bet, the payout will be
    * -$3.00.
    * 
    * @param dice       A dice object representing the outome of the roll
    * @param betAmount  The amount of the bet in dollars
    * @return The payout amount in dollars. This will be a negative number if it
    *         was a losing bet.
    */
   public static double fieldBet(Dice dice, double betAmount) {
	   double payout = 0.0;
	   int one_rolled = 1;
	   
	   if(dice.addValues() <= 8 || dice.addValues() >= 12) 
	   	{ payout = betAmount * one_rolled; }
	   else 
	   	{ payout = -betAmount; }
	   return payout;
   }

}

