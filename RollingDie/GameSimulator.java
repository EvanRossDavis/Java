/**
   This program simulates the wins and losses for
   two different games of dice.
*/
public class GameSimulator
{
   private int tries;
   private Die d1, d2;
   private int wins;
   private int losses;

   /**
      Construct a simulator object for die games.
      @param numSides the number of sides on the die.
      @param numTries the number of times to run the simulation.
   */
   public GameSimulator(int numSides, int numTries)
   {
        d1 = new Die(numSides);
        d2 = new Die(numSides);
        tries = numTries;
   }

   /**
      Runs a single die simulation.
      One die is cast 4 times. If a six appears in those 4 casts,
      then wins is incremented, otherwise losses is incremented.
      Simulation is run according to the number of tries set.
   */
   public void runSingleDieSimulation()
   {
       for (int i = 0; i < tries; i++)
        {
            boolean flag = false;

            for (int j = 0; j < 4; j++)

                if (d1.cast() == 6)
                {
                    wins++;
                    flag = true;
                    break;
                }

            if (!flag)
            {
                losses++;
            }


        }

   }

   /**
      Runs a double die simulation.
      A pair of dice are cast 24 times. If a double-six appears in
      those 24 casts, then wins is incremented, otherwise losses
      is incremented. The simulation is run according to the number
      of tries set.
   */
   public void runDoubleDieSimulation()
   {
       for (int i = 0; i < tries; i++)
       {

           boolean flag = false;

           for (int j = 0; j < 24; j++)
           {
               if (d1.cast() == 6 && d2.cast() == 6) {
                   wins++;
                   flag = true;
                   break;
               }

           } if (flag == false) losses++;

       }

   }


   /**
      Returns the % of wins.
      @return the % of wins.
   */
   public double getWinPercent()
   {
      return (double)(wins) / (wins + losses);
   }

   /**
      Returns the number of wins.
      @return the number of wins.
   */
   public int getWins()
   {
      return wins;
   }

   /**
      Returns the number of losses.
      @return the number of losses.
   */
   public int getLosses()
   {
      return losses;
   }
}
