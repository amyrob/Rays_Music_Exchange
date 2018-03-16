package Shop.Instruments;

import Shop.Interfaces.IPlay;
import Shop.Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {
    private InstrumentGroupType instrumentGroupType;
    private String material;
    private String brand;
    private int buyPrice;
    private int sellPrice;

    public Instrument(InstrumentGroupType instrumentGroupType, String material, String brand, int buyPrice, int sellPrice) {
        this.instrumentGroupType = instrumentGroupType;
        this.material = material;
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public InstrumentGroupType getInstrumentGroupType() {
        return this.instrumentGroupType;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getBrand() {
        return this.brand;
    }
    public int calculateMarkUp() {
        return sellPrice - buyPrice;
    }

}
