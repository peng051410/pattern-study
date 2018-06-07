package cn.imcompany.function.image;

/**
 * Created by tomyli on 2018/6/7.
 * Github: https://github.com/peng051410
 */
public class GifImageFactory implements ImageFactory {

    @Override
    public Image makeImage() {
        return new GifImage();
    }
}
