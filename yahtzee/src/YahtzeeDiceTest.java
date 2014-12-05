import junit.framework.Assert;
import org.junit.Test;

public class YahtzeeDiceTest {

    @Test
    public void dice_total_returns_sum_of_dice() {

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();
        Dice dice4 = new Dice();
        Dice dice5 = new Dice();

        dice1.setFaceValue(2);
        dice2.setFaceValue(6);
        dice3.setFaceValue(3);
        dice4.setFaceValue(4);
        dice5.setFaceValue(5);

        int expected = 20;

        YahtzeeDice dice = new YahtzeeDice(dice1, dice2, dice3, dice4, dice5);



        int actual =  dice.getTotal();
        Assert.assertEquals(expected, actual);



    }

    @Test
         public void dice_total_for_1_returns_sum_of_1s() {

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();
        Dice dice4 = new Dice();
        Dice dice5 = new Dice();

        dice1.setFaceValue(2);
        dice2.setFaceValue(1);
        dice3.setFaceValue(3);
        dice4.setFaceValue(1);
        dice5.setFaceValue(5);

        int expected = 2;

        YahtzeeDice dice = new YahtzeeDice(dice1, dice2, dice3, dice4, dice5);



        int actual =  dice.getTotalFor(1);
        Assert.assertEquals(expected, actual);



    }






}

