import Parts.Engine;
import Parts.Finishes;
import Parts.Tyre;
import eNums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class VehicleTest {

    Vehicle vehicle;
    Engine engine;
    Tyre tyres;
    Finishes finishes;


    @Before
    public void before(){
        engine = new Engine(1.6);
        tyres = new Tyre(4);
        finishes = new Finishes(false);
        vehicle = new Vehicle(Type.HATCHBACK, "Ford", "Fiesta", 9999.99, "red", engine, tyres, finishes);
    }

    @Test
    public void hasType(){
        assertEquals(Type.HATCHBACK, vehicle.getType());
    }

    @Test
    public void hasMake(){
        assertEquals("Ford", vehicle.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Fiesta", vehicle.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(9999.99, vehicle.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("red", vehicle.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals(1.6, engine.getSize(), 0.01);
    }

    @Test
    public void hasTyres(){
        assertEquals(4, tyres.getTyres());
    }

    @Test
    public void hasFinishes(){
        assertEquals(false, finishes.getMats());
    }

}
