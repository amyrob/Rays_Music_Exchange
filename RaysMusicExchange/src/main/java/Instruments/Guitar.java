package Instruments;

public class Guitar extends Instrument {
    private int noStrings;
    private String type;

    public Guitar(int noStrings, String type, InstrumentGroupType instrumentType, String material, String brand) {
        super(instrumentType, material, brand);
        this.noStrings = noStrings;
        this.type = type;
    }

    public int getNoStrings() {
        return this.noStrings;
    }

    public String getType() {
        return this.type;
    }

    public String play(String sound) {
        return sound;
    }
}
