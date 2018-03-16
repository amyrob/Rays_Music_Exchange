import Shop.Instruments.Guitar;
import Shop.Instruments.InstrumentGroupType;
import org.junit.Before;
import org.junit.Test;

import static Shop.Instruments.InstrumentGroupType.STRING;
import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(6, "Electric", InstrumentGroupType.STRING, "Ash", "Fender",80, 249);
    }
    @Test
    public void canGetNoStrings() {
        assertEquals(6, guitar.getNoStrings());
    }
    @Test
    public void canGetType() {
        assertEquals("Electric", guitar.getType());
    }
    @Test
    public void canGetInstrumentGroupType(){
        assertEquals(STRING, guitar.getInstrumentGroupType());
    }
    @Test
    public void canGetMaterial(){
        assertEquals("Ash", guitar.getMaterial());
    }
    @Test
    public void canGetBrand(){
        assertEquals("Fender", guitar.getBrand());
    }
    @Test
    public void canPlay() {
        assertEquals("Twaaaang", guitar.play("Twaaaang"));
    }
    @Test
    public void canGetMarkUp() {
        assertEquals(169, guitar.calculateMarkUp());
    }

}
