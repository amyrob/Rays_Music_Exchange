package Instruments;

public class Piano extends Instrument {
    private int noKeys;
    private String type;

    public Piano(int noKeys, String type, InstrumentGroupType instrumentType, String material, String brand) {
        super(instrumentType, material, brand);
        {
            this.noKeys = noKeys;
            this.type = type;
        }
    }
    public int getNoKeys() {
        return noKeys;
    }

    public String getType () {
        return this.type;
    }

    public String play(String sound) {
        return sound;
    }
}
