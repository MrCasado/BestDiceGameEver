import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

        line.score(new YahtzeeDice(dice1, dice2, dice3, dice4, dice5));

        assertEquals(line.getScore(), dice1.getFaceValue()
                + dice2.getFaceValue() + dice3.getFaceValue()
                + dice4.getFaceValue() + dice5.getFaceValue());
    }

    @Test
    public void score_one_pair_as_total() {

        Dice dice1 = new Dice(2);
        Dice dice2 = new Dice(2);
        Dice dice3 = new Dice(4);
        Dice dice4 = new Dice(5);
        Dice dice5 = new Dice(1);

        ScoreCardLine line = new ScoreCardLine(Category.ONE_PAIR, "", "");

        assertEquals(line.getScore(), 0);

        line.score(new YahtzeeDice(dice1, dice2, dice3, dice4, dice5));

        assertEquals(line.getScore(), 14);
    }
    @Test
    public void do_not_score_not_one_pair_as_total() {

        Dice dice1 = new Dice(3);
        Dice dice2 = new Dice(2);
        Dice dice3 = new Dice(4);
        Dice dice4 = new Dice(5);
        Dice dice5 = new Dice(1);

        ScoreCardLine line = new ScoreCardLine(Category.ONE_PAIR, "", "");

        assertEquals(line.getScore(), 0);

        line.score(new YahtzeeDice(dice1, dice2, dice3, dice4, dice5));

        assertEquals(line.getScore(), 0);
    }

    @Test
    public void score_card_line_is_valid_when_is_one_pair() {

        ScoreCardLine line = new ScoreCardLine(Category.ONE_PAIR, "", "");

        Dice dice1 = new Dice(2);
        Dice dice2 = new Dice(2);
        Dice dice3 = new Dice(4);
        Dice dice4 = new Dice(5);
        Dice dice5 = new Dice(1);
        YahtzeeDice yahtzeeDice = new YahtzeeDice(dice1,dice2,dice3, dice4, dice5);
        line.isValid(yahtzeeDice);
        assertTrue("ONE PAIR", line.isValid(yahtzeeDice));

    }

    @Test
    public void score_card_line_is_invalid_when_is_not_one_pair() {

        ScoreCardLine line = new ScoreCardLine(Category.ONE_PAIR, "", "");

        Dice dice1 = new Dice(2);
        Dice dice2 = new Dice(3);
        Dice dice3 = new Dice(4);
        Dice dice4 = new Dice(5);
        Dice dice5 = new Dice(1);
        YahtzeeDice yahtzeeDice = new YahtzeeDice(dice1,dice2,dice3, dice4, dice5);
        line.isValid(yahtzeeDice);
        assertFalse("ONE PAIR", line.isValid(yahtzeeDice));

    }

}
