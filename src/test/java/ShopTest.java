import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop testShop;
    Guitar testGuitar;
    SheetMusic testSheetMusic;
    GuitarPick testGuitarPick;

    @Before
    public void before(){
        testGuitar = new Guitar("Gibson", "Hummingbird", 1299.99, 1799.99, "Wood");
        testSheetMusic = new SheetMusic("Moonlight Sonata", 9.99, 16.99);
        testShop = new Shop();
        testGuitarPick = new GuitarPick("Dunlop Pick", 0.50, 1.50);
    }

    @Test
    public void canAddToStock(){
        testShop.addToStock(testGuitar);
        testShop.addToStock(testSheetMusic);
        assertEquals(testShop.stockCount(), 2);
    }

    @Test
    public void canRemoveFromStock() {
        testShop.addToStock(testGuitar);
        testShop.addToStock(testSheetMusic);
        testShop.removeFromStock(testSheetMusic);
        assertEquals(testShop.stockCount(), 1);
    }

    @Test
    public void canCalculateProfit(){
        testShop.addToStock(testGuitar);
        testShop.addToStock(testSheetMusic);
        assertEquals(testShop.calculateTotalProfit(), 507, 0.2);
    }

    @Test
    public void canAddMultipleTypes(){
        testShop.addToStock(testGuitar);
        testShop.addToStock(testSheetMusic);
        testShop.addToStock(testGuitarPick);
        assertEquals(testShop.stockCount(), 3);
    }

}
