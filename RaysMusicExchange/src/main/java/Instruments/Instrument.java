package Instruments;

import Interfaces.IPlay;

public abstract class Instrument implements IPlay {
    private InstrumentGroupType instrumentGroupType;
    private String material;
    private String brand;

    public Instrument(InstrumentGroupType instrumentGroupType, String material, String brand) {
        this.instrumentGroupType = instrumentGroupType;
        this.material = material;
        this.brand = brand;
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

}
