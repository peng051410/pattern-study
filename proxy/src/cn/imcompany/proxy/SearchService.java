package cn.imcompany.proxy;

/**
 * Created by tomyli on 2018/6/28.
 * Github: https://github.com/peng051410
 */
public class SearchService implements Search {

    @Override
    public void queryIncome(String username) {

        System.out.println(username + "开始查询");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(username + "查询完成");
    }
}
