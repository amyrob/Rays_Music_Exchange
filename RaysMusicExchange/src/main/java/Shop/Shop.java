package Shop;

import Shop.Interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int addStock(ISell stock) {
        this.stock.add(stock);
        return this.stock.size();
    }

    public int removeStock(ISell stock) {
        this.stock.remove(stock);
        return this.stock.size();
    }

    public int getProfit(){
        int total = 0;
        for (ISell item : stock) {
            total += item.calculateMarkUp();
        }
        return total;
    }
}
