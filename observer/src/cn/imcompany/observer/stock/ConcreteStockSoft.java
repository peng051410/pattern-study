package cn.imcompany.observer.stock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomyli on 2018/6/23.
 * Github: https://github.com/peng051410
 */
public class ConcreteStockSoft implements StockSoft {

    private List<Buyer> buyerList;

    public ConcreteStockSoft() {
        this.buyerList = new ArrayList<>();
    }

    public void join(Buyer buyer) {
        buyerList.add(buyer);
    }

    public void quit(Buyer buyer) {
        buyerList.remove(buyer);
    }

    @Override
    public void goUp() {

        buyerList.forEach(Buyer::happy);
    }

    @Override
    public void goDown() {

        buyerList.forEach(Buyer::sad);
    }
}

