
import static org.junit.Assert.assertEquals;

import java.util.List;

public class Yahtzee {

    public static void main (String[] args)
	   {



          Console console = new Console();


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
	      
	      console.writeLineToConSoleWithNewLine("Your roll is : " +
	      		          dice1.getFaceValue() + 
	    		    " " + dice2.getFaceValue() +
	      			" " + dice3.getFaceValue() +
	      			" " + dice4.getFaceValue() +
	      			" " + dice5.getFaceValue());
	      
	      
	      //ScoreCardLine line = new ScoreCardLine(Category.CHANCE, "", "");
	    	
	    	
	      
	      //System.out.println("Your CHANCE LINE SCORE is " + line.getScore());

          ScoreCard card;
	      ScoreCardAssembler scoreCardAssembler = new ScoreCardAssembler();
	      card = scoreCardAssembler.assembleScoreCard();


           List<ScoreCardLine> scoreCardLines = card.getScoreCardLines();
           int i=1;
           for(ScoreCardLine line : scoreCardLines) {
               line.score(dice1, dice2, dice3, dice4, dice5);
            }
          printScoreCard(card, console);



	      
	      
	   }

    private static void printScoreCard(ScoreCard card, Console console)
    {
        List<ScoreCardLine> scoreCardLines = card.getScoreCardLines();

        int i=1;
        for(ScoreCardLine line : scoreCardLines) {
            //line.score(dice1, dice2, dice3, dice4, dice5);
            console.writeLineToConSoleWithNewLine(i++ + " " + line.getName() + ": " + line.getDescription() + " - Score: " + line.getScore());
        }
    }

}
