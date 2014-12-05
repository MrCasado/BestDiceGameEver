import junit.framework.Assert;
import org.junit.Test;

public class YahtzeeDiceTest {

    @Test
    public void dice_total_returns_sum_of_dice() {

        Dice dice1 = new Dice(2);
        Dice dice2 = new Dice(6);
        Dice dice3 = new Dice(3);
        Dice dice4 = new Dice(4);
        Dice dice5 = new Dice(5);

        int expected = 20;

        YahtzeeDice dice = new YahtzeeDice(dice1, dice2, dice3, dice4, dice5);



        int actual =  dice.getTotal();
        Assert.assertEquals(expected, actual);



    }

    @Test
         public void dice_total_for_1_returns_sum_of_1s() {

        Dice dice1 = new Dice(2);
        Dice dice2 = new Dice(1);
        Dice dice3 = new Dice(3);
        Dice dice4 = new Dice(1);
        Dice dice5 = new Dice(5);

        int expected = 2;

        YahtzeeDice dice = new YahtzeeDice(dice1, dice2, dice3, dice4, dice5);



        int actual =  dice.getTotalFor(1);
        Assert.assertEquals(expected, actual);



    }






}

