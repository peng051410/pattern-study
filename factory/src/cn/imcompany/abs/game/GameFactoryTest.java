package cn.imcompany.abs.game;

import java.io.*;

/**
 * Created by tomyli on 2018/6/7.
 * Github: https://github.com/peng051410
 */
public class GameFactoryTest {

    public static void main(String[] args) throws Exception {

        String packageName = GameFactory.class.getPackage().getName();
        String path = GameFactoryTest.class.getResource("").getPath();
        File file = new File(path + "game.txt");

        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        LineNumberReader lnr = new LineNumberReader(isr);
        String factoryName = lnr.readLine();

        Class<?> aClass = Class.forName(packageName + "." + factoryName);
        GameFactory factory = (GameFactory) aClass.newInstance();
        Operation operation = factory.createOperation();
        GameInerface anInterface = factory.createInterface();

        new Game(operation, anInterface).startGame();

    }

}
