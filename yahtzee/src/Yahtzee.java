
import java.util.List;

public class Yahtzee {
	
	public static void main (String[] args)
	   {

	      Dice dice1 = new Dice();
	      Dice dice2 = new Dice();
	      Dice dice3 = new Dice();
	      Dice dice4 = new Dice();
	      Dice dice5 = new Dice();

	      dice1.roll();
	      dice2.roll();
	      dice3.roll();
	      dice4.roll();
	      dice5.roll();
	      
	      System.out.println
	               ("Your roll is : " +
	      		          dice1.getFaceValue() + 
	    		    " " + dice2.getFaceValue() +
	      			" " + dice3.getFaceValue() +
	      			" " + dice4.getFaceValue() +
	      			" " + dice5.getFaceValue());
	      
	      ScoreCardAssembler scoreCardAssembler = new ScoreCardAssembler();
	      ScoreCard scoreCard = scoreCardAssembler.assembleScoreCard();
	     
	      List<ScoreCardLine> scoreCardLines = scoreCard.getScoreCardLines();
	      
	      int i=1;
	      for(ScoreCardLine line : scoreCardLines) {
	    	    System.out.println(i++ + " " + line.getName() + ": " + line.getDescription());
	    	}

	      
	      
	   }

}
