package cn.imcompany.observer.stock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomyli on 2018/6/23.
 * Github: https://github.com/peng051410
 */
public class NiuStock implements Stock {

    private List<Buyer> buyerList;

    public NiuStock() {
        this.buyerList = new ArrayList<>();
    }

    public void buy(Buyer buyer) {
        buyerList.add(buyer);
    }

    public void sale(Buyer buyer) {
        buyerList.remove(buyer);
    }

    @Override
    public void goUp(String name) {
        buyerList.stream().filter(buyer -> !buyer.getName().equals(name))
                .forEach(Buyer::happy);
    }

    @Override
    public void goDown() {
        buyerList.forEach(Buyer::disject);
    }
}
