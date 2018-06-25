package cn.imcompany.observer.stock;

/**
 * Created by tomyli on 2018/6/23.
 * Github: https://github.com/peng051410
 */
public class StockTest {

    public static void main(String[] args) {

        NiuStock niuStock = new NiuStock();

        ConcrectBuyer buyer, buyer1, soft;
        buyer = new ConcrectBuyer();
        buyer.setName("buyer");
        buyer1 = new ConcrectBuyer();
        buyer1.setName("buyer1");
        soft = new ConcrectBuyer();
        soft.setName("soft");

        niuStock.buy(buyer);
        niuStock.buy(buyer1);
        niuStock.buy(soft);

        soft.change(niuStock);
    }
}
