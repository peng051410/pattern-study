package cn.imcompany.abs.game;

/**
 * Created by tomyli on 2018/6/7.
 * Github: https://github.com/peng051410
 */
public class SymbianGameFactory implements GameFactory {

    @Override
    public Operation createOperation() {
        return new SymbianOperation();
    }

    @Override
    public GameInerface createInterface() {
        return new SymbianGameInerface();
    }
}
