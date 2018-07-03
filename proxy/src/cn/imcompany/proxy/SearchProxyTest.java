package cn.imcompany.proxy;

/**
 * Created by tomyli on 2018/6/28.
 * Github: https://github.com/peng051410
 */
public class SearchProxyTest {

    public static void main(String[] args) {

        SearchProxy searchProxy = new SearchProxy();
        searchProxy.queryIncome("admin");

        searchProxy.queryIncome("tomyli");
    }
}
