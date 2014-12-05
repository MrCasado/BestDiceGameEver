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
	public void score (Dice dice1, Dice dice2, Dice dice3, Dice dice4, Dice dice5){
		switch (category){
			case CHANCE: 
				score += dice1.getFaceValue();
				score += dice2.getFaceValue();
				score += dice3.getFaceValue();
				score += dice4.getFaceValue();
				score += dice5.getFaceValue();
				
			
		}
	}
}
