package Instruments;

public class DrumKit extends Instrument{
    private int noKitPieces;
    private String type;

    public DrumKit(int noKitPieces, String type, InstrumentGroupType instrumentType, String material, String brand) {
        super(instrumentType, material, brand);
        this.noKitPieces = noKitPieces;
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public int getNoKitPieces() {
        return this.noKitPieces;
    }

    public String play(String sound) {
        return sound;
    }
}
