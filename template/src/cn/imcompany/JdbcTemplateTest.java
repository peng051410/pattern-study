package cn.imcompany;

import cn.imcompany.template.dao.MemberDao;

/**
 * Created by tomyli on 2018/6/22.
 * Github: https://github.com/peng051410
 */
public class JdbcTemplateTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        System.out.println(memberDao.query("select * from member"));
    }
}
