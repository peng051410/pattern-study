package cn.imcompany.function.image;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * Created by tomyli on 2018/6/7.
 * Github: https://github.com/peng051410
 */
public class ImageFactoryTest {

    public static void main(String[] args) throws Exception {

        System.out.println(ImageFactory.class.getPackage().getName());

        String outPath = ImageFactoryTest.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        System.out.println(outPath);

        ImageFactoryTest imageFactoryTest = new ImageFactoryTest();
        String path = imageFactoryTest.getClass().getResource("").getPath();
        System.out.println(path.substring(outPath.length()));

        File file = new File(path + "image.txt");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fis);
        LineNumberReader lnr = new LineNumberReader(inputStreamReader);
        String imageName = lnr.readLine();

        // Class<?> aClass = Class.forName(path.substring(outPath.length()).replaceAll("/", ".") +  imageName);
        Class<?> aClass = Class.forName(ImageFactory.class.getPackage().getName() + "." +  imageName);
        ImageFactory factory = (ImageFactory) aClass.newInstance();
        Image image = factory.makeImage();
        image.metaData();
    }

}
