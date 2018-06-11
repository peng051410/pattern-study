package cn.imcompany.abs.game;

/**
 * Created by tomyli on 2018/6/7.
 * Github: https://github.com/peng051410
 */
public class AppleGameInerface implements GameInerface {

    @Override
    public void showName() {

        System.out.println(this.getClass().getSimpleName());

    }
}
