package cn.imcompany.abs.game;

/**
 * Created by tomyli on 2018/6/7.
 * Github: https://github.com/peng051410
 */
public class AndroidGameFactory implements GameFactory {

    @Override
    public Operation createOperation() {
        return new AndroidOperation();
    }

    @Override
    public GameInerface createInterface() {
        return new AndroidGameInerface();
    }
}
