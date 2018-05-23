import Parts.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre(4);
    }

    @Test
    public void hasTyres(){
        assertEquals(4, tyre.getTyres());
    }
}
