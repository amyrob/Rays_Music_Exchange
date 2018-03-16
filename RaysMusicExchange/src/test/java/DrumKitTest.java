import Shop.Instruments.DrumKit;
import Shop.Instruments.InstrumentGroupType;
import org.junit.Before;
import org.junit.Test;

import static Shop.Instruments.InstrumentGroupType.PERCUSSION;
import static org.junit.Assert.assertEquals;

public class DrumKitTest {
    DrumKit drumKit;

    @Before
    public void before() {
    drumKit = new DrumKit(5, "Rock", InstrumentGroupType.PERCUSSION, "Birch", "Pearl", 249, 499);
    }

    @Test
    public void canGetType() {
        assertEquals("Rock", drumKit.getType());
    }
    @Test
    public void canGetNoOfKitPieces() {
        assertEquals(5, drumKit.getNoKitPieces());
    }
    @Test
    public void canGetInstrumentGroupType(){
        assertEquals(PERCUSSION, drumKit.getInstrumentGroupType());
    }
    @Test
    public void canGetMaterial(){
        assertEquals("Birch", drumKit.getMaterial());
    }
    @Test
    public void canGetBrand(){
        assertEquals("Pearl", drumKit.getBrand());
    }
    @Test
    public void canPlay() {
        assertEquals("*cymbal crash*", drumKit.play("*cymbal crash*"));
    }
    @Test
    public void canGetMarkUp() {
        assertEquals(250, drumKit.calculateMarkUp());
    }

}

