package cn.imcompany.observer.stock;

/**
 * Created by tomyli on 2018/6/23.
 * Github: https://github.com/peng051410
 */
public class ConcrectBuyer implements Buyer {

    private String name;

    @Override
    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void happy() {
        System.out.println(this.getName() + ":happy");
    }

    @Override
    public void sad() {

        System.out.println(this.getName() + ":sad");
    }

}
