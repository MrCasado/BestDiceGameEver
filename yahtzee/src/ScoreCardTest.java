import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 05/12/14
 * Time: 13:58
 * To change this template use File | Settings | File Templates.
 */
public class ScoreCardTest {

    @Test
    public void total_is_sum_of_scores()
    {
        ScoreCard card = new ScoreCard();
        List<ScoreCardLine> lines = new ArrayList<ScoreCardLine>();
        ScoreCardLine line1 = new ScoreCardLine(Category.CHANCE, "", "");
        ScoreCardLine line2 = new ScoreCardLine(Category.ONE_PAIR, "", "");
        line1.setScore(10);
        line2.setScore(12);
        lines.add(line1);
        lines.add(line2);
        card.setScoreCardLines(lines);

        int expected=22;
        int actual = card.getTotal();
        Assert.assertEquals(expected, actual);
    }
}
