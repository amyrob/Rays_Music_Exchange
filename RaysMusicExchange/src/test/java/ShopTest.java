import Shop.Instruments.DrumKit;
import Shop.Instruments.Guitar;
import Shop.Instruments.InstrumentGroupType;
import Shop.Instruments.Piano;
import Shop.Interfaces.ISell;
import org.junit.Before;
import Shop.Shop;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    ISell stock;
    Guitar guitar;
    Piano piano;
    DrumKit drumKit;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar(6, "Accoustic", InstrumentGroupType.STRING, "Mahogany", "Yahmaha", 100, 250);
        piano = new Piano(81, "Baby Grand", InstrumentGroupType.KEYS, "Oak", "Yamaha", 1500, 3000);
        drumKit = new DrumKit(5, "Junior", InstrumentGroupType.PERCUSSION, "Birch", "Ludwig", 150, 450);

    }

    @Test
    public void canAddStock() {
        assertEquals(1, shop.addStock(stock));
    }
    @Test
    public void canRemoveStock() {
        shop.addStock(stock);
        assertEquals(0, shop.removeStock(stock));
    }
    @Test
public void canGetShopProfit() {
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(drumKit);
        assertEquals(1950, shop.getProfit());
    }
}
