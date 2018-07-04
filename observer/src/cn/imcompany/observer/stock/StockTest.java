package cn.imcompany.observer.stock;

/**
 * Created by tomyli on 2018/6/23.
 * Github: https://github.com/peng051410
 */
public class StockTest {

    public static void main(String[] args) {

        ConcreteStockSoft niuStock = new ConcreteStockSoft();

        ConcrectBuyer buyer1, buyer2, buyer3;
        buyer1 = new ConcrectBuyer();
        buyer1.setName("buyer1");
        buyer2 = new ConcrectBuyer();
        buyer2.setName("buyer2");
        buyer3 = new ConcrectBuyer();
        buyer3.setName("buyer3");

        niuStock.join(buyer1);
        niuStock.join(buyer2);
        niuStock.join(buyer3);

        niuStock.goUp();

        niuStock.quit(buyer1);
        niuStock.goDown();
    }
}
