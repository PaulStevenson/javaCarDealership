import Parts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(1.6);
    }

    @Test
    public void hasEngineSize(){
        assertEquals(1.6, engine.getSize(), 0.01);
    }
}
