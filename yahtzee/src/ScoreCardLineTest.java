import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ScoreCardLineTest {
	
    @Test
    public void score_chance_as_total() {
 
    	Dice dice1 = new Dice();
    	Dice dice2 = new Dice();
    	Dice dice3 = new Dice();
    	Dice dice4 = new Dice();
    	Dice dice5 = new Dice();
    	
    	ScoreCardLine line = new ScoreCardLine(Category.CHANCE, "", "");
    	
    	assertEquals(line.getScore(), 0);
    	
    	line.score(dice1, dice2, dice3, dice4, dice5);
    	
    	assertEquals(line.getScore(), dice1.getFaceValue()
    			+ dice2.getFaceValue() + dice3.getFaceValue()
    			+ dice4.getFaceValue() + dice5.getFaceValue());
    }

}
