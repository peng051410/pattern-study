package cn.imcompany.proxy;

/**
 * Created by tomyli on 2018/6/28.
 * Github: https://github.com/peng051410
 */
public class SearchProxy implements Search {

    private Logger logger = new Logger();
    private Auth auth = new Auth();
    private Search search = new SearchService();

    @Override
    public void queryIncome(String username) {

        logger.beforeLog(username);
        if (auth.valid(username)) {
            search.queryIncome(username);
        }
        logger.afterLog(username);
    }
}
