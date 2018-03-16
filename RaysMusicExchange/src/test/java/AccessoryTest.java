import Shop.Accessories.Accessory;
import org.junit.Before;
import org.junit.Test;

import static Shop.Accessories.AccessoryType.DRUM_STICKS;
import static org.junit.Assert.assertEquals;

public class AccessoryTest {
    Accessory accessory;

    @Before
    public void before() {
        accessory = new Accessory(DRUM_STICKS, 6, 15);
    }
    @Test
    public void canGetAccessoryType() {
        assertEquals(DRUM_STICKS, accessory.getType());
    }
    @Test
    public void canGetBuyPrice() {
        assertEquals(6, accessory.getBuyPrice());
    }
    @Test
    public void canGetSellPrice() {
        assertEquals(15, accessory.getSellPrice());
    }


    @Test
    public void canCalculateMarkUp() {
        assertEquals(9, accessory.calculateMarkUp());
    }

}
