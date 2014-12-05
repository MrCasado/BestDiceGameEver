import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreCardLine {
	
	private String name;
	private String description;
	private Category category;
	private int score = 0;
	
	public ScoreCardLine(Category category, String name, String description) {
		super();
		this.setCategory(category);
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score=score;
    }
	public void score (Dice dice1, Dice dice2, Dice dice3, Dice dice4, Dice dice5){
		switch (category){
			case CHANCE:
            case ONE_PAIR:
				score += dice1.getFaceValue();
				score += dice2.getFaceValue();
				score += dice3.getFaceValue();
				score += dice4.getFaceValue();
				score += dice5.getFaceValue();
				
			
		}
	}

    public boolean isValid (YahtzeeDice yahtzeeDice)
    {
        switch (category){
            case CHANCE:
                return true;
            case ONE_PAIR:
                Integer[] map = new Integer[6];

                for(int i=0;i<6;i++)
                {
                    map[i]=0;
                }
                List<Dice> dice = yahtzeeDice.getDice();
                for (Dice die: dice)
                {
                    map[die.getFaceValue()]++;
                }
                for(int i=0;i<6;i++)
                {
                    if (map[i]>1)
                        return true;
                }
                return false;
        }
        return false;
    }
}
