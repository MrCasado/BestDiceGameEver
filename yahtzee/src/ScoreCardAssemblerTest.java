import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 05/12/14
 * Time: 13:46
 * To change this template use File | Settings | File Templates.
 */
public class ScoreCardAssemblerTest {

    @Test
    public void card_is_in_specified_order(){
        ScoreCard card = ScoreCardAssembler.assembleScoreCard();

        Assert.assertEquals(Category.CHANCE, card.getScoreCardLines().get(0).getCategory());

        Assert.assertEquals(Category.ONE_PAIR, card.getScoreCardLines().get(1).getCategory());
    }
}
