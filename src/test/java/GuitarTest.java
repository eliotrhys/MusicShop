import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar testGuitar;

    @Before
    public void before(){
        testGuitar = new Guitar("Gibson", "Hummingbird", 1299.99, 1799.99, "Wood");
    }

    @Test
    public void canGetFromGuitar(){
        assertEquals("Gibson", testGuitar.getBrand());
        assertEquals("Hummingbird", testGuitar.getModel());
        assertEquals(1299.99, testGuitar.getBuyPrice(), 0.2);
        assertEquals(1799.99, testGuitar.getSellPrice(), 0.2);
        assertEquals("Wood", testGuitar.getMaterial());
    }

}
