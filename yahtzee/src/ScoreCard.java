

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {
	private List<ScoreCardLine> scoreCardLines = new ArrayList<ScoreCardLine>();
	
	public void addLine (ScoreCardLine line)
	{
		scoreCardLines.add(line);
	}
	
	public List<ScoreCardLine> getScoreCardLines() {
		return scoreCardLines;
	}

}
