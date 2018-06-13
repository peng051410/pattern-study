package cn.imcompany.abs;

/**
 * Created by tomyli on 2018/5/28.
 * Github: https://github.com/peng051410
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        AbstractBeerFactory beerFactory = new ConcreteBeerFactory();
        System.out.println(beerFactory.getBaiWei());
    }

}
