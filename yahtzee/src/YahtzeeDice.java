import java.util.Arrays;
import java.util.List;

public class YahtzeeDice {

  private Dice dice1 = new Dice();
  private Dice dice2 = new Dice();
  private Dice dice3 = new Dice();
  private Dice dice4 = new Dice();
  private Dice dice5 = new Dice();

    public YahtzeeDice(Dice dice1, Dice dice2, Dice dice3, Dice dice4, Dice dice5) {
        this.dice1 = dice1;
        this.dice2 = dice2;
        this.dice3 = dice3;
        this.dice4 = dice4;
        this.dice5 = dice5;


    }

    public int getTotalFor(int i) {
        int total=0;

        List<Dice> dice = Arrays.asList(dice1, dice2, dice3, dice4, dice5);

        for (Dice die: dice)
        {
            if (die.getFaceValue()==i)
            {
                total+=i;
            }
        }

        return total;
    }
    public int getTotal() {
        return (dice1.getFaceValue() + dice2.getFaceValue() + dice3.getFaceValue() + dice4.getFaceValue() + dice5.getFaceValue());
    }

    public List<Dice> getDice(){
        return Arrays.asList(dice1, dice2, dice3, dice4, dice5);
    }


}
