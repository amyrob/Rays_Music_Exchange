import Shop.Instruments.InstrumentGroupType;
import Shop.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static Shop.Instruments.InstrumentGroupType.KEYS;
import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(49, "Digital", InstrumentGroupType.KEYS, "Pine", "Fazioli", 199, 399);
    }
    @Test
    public void canGetNoKeys() {
        assertEquals(49, piano.getNoKeys());
    }
    @Test
    public void canGetType() {
        assertEquals("Digital", piano.getType());
    }

    @Test
    public void canGetInstrumentGroupType(){
        assertEquals(KEYS, piano.getInstrumentGroupType());
    }
    @Test
    public void canGetMaterial(){
        assertEquals("Pine", piano.getMaterial());
    }
    @Test
    public void canGetBrand(){
        assertEquals("Fazioli", piano.getBrand());
    }
    @Test
    public void canPlay() {
        assertEquals("Plinky plonky", piano.play("Plinky plonky"));
    }
    @Test
    public void canGetMarkUp() {
        assertEquals(200, piano.calculateMarkUp());
    }
}
