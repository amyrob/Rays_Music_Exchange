package Shop.Accessories;

import Shop.Interfaces.ISell;

public class Accessory implements ISell {
    private AccessoryType accessoryType;
    private int buyPrice;
    private int sellPrice;

    public Accessory(AccessoryType accessoryType, int buyPrice, int sellPrice) {
        this.accessoryType = accessoryType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int calculateMarkUp() {
        return sellPrice - buyPrice;
    }

    public AccessoryType getType() {
        return this.accessoryType;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }
}
