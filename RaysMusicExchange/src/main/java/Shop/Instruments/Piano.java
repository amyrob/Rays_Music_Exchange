package Shop.Instruments;

public class Piano extends Instrument {
    private int noKeys;
    private String type;

    public Piano(int noKeys, String type, InstrumentGroupType instrumentType, String material, String brand, int buyPrice, int sellPrice) {
        super(instrumentType, material, brand, buyPrice, sellPrice);
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
