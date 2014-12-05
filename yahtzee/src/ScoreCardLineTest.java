import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void score_one_pair_as_total() {

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();
        Dice dice4 = new Dice();
        Dice dice5 = new Dice();

        ScoreCardLine line = new ScoreCardLine(Category.ONE_PAIR, "", "");

        assertEquals(line.getScore(), 0);

        line.score(dice1, dice2, dice3, dice4, dice5);

        assertEquals(line.getScore(), dice1.getFaceValue()
                + dice2.getFaceValue() + dice3.getFaceValue()
                + dice4.getFaceValue() + dice5.getFaceValue());
    }

    @Test
    public void score_card_line_is_valid_when_is_one_pair() {

        ScoreCardLine line = new ScoreCardLine(Category.ONE_PAIR, "", "");

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();
        Dice dice4 = new Dice();
        Dice dice5 = new Dice();
        dice1.setFaceValue(2);
        dice2.setFaceValue(2);
        dice3.setFaceValue(4);
        dice4.setFaceValue(5);
        dice5.setFaceValue(1);
        YahtzeeDice yahtzeeDice = new YahtzeeDice(dice1,dice2,dice3, dice4, dice5);
        line.isValid(yahtzeeDice);
        assertTrue("ONE PAIR", line.isValid(yahtzeeDice));

    }

}
