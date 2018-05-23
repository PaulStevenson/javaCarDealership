import Parts.Finishes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinishesTest {

    Finishes finishes;

    @Before
    public void before(){
        finishes = new Finishes(false);
    }

    @Test
    public void hasMats(){
        assertEquals(false, finishes.getMats());
    }


}
