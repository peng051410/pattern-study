package cn.imcompany.abs.game;

/**
 * Created by tomyli on 2018/6/7.
 * Github: https://github.com/peng051410
 */
public interface GameFactory {

    Operation createOperation();

    GameInerface createInterface();

}
