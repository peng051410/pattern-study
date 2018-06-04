package cn.imcompany.register;

/**
 * Created by tomyli on 2018/5/31.
 * Github: https://github.com/peng051410
 */
//常量中去使用，常量不就是用来大家都能够共用吗？
//通常在通用API中使用
public enum Color {
    RED() {
        private int r = 255;
        private int g = 0;
        private int b = 0;

    }, BLACK() {
        private int r = 0;
        private int g = 0;
        private int b = 0;
    }, WHITE() {
        private int r = 255;
        private int g = 255;
        private int b = 255;
    };
}
