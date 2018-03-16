import Instruments.Guitar;
import Instruments.InstrumentGroupType;
import org.junit.Before;
import org.junit.Test;

import static Instruments.InstrumentGroupType.STRING;
import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(6, "Electric", InstrumentGroupType.STRING, "Ash", "Fender");
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

}
