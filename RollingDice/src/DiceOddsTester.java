/**
   This program simulates the wins and losses for
   two different games of dice.
*/
public class DiceOddsTester
{
   public static void main(String[] args)
   {

      GameSimulator simulator = new GameSimulator(6, 1000000);

      simulator.runSingleDieSimulation();
      	System.out.println("Wins: " + simulator.getWins());
      	System.out.println("Losses: " + simulator.getLosses());
       		System.out.println("Game #1 wins: " + simulator.getWinPercent());
       		System.out.println("Expected: .51");

      simulator.runDoubleDieSimulation();
      	System.out.println("Game #2 wins: " + simulator.getWinPercent());
      	System.out.println("Wins: " + simulator.getWins());
      		System.out.println("Losses: " + simulator.getLosses());
      		System.out.println("Expected: .49");

   }
}
