package cn.imcompany.template.dao;

import cn.imcompany.template.JdbcTemplate;
import cn.imcompany.template.MemberRowMapper;

import java.util.List;

/**
 * Created by tomyli on 2018/6/21.
 * Github: https://github.com/peng051410
 */
public class MemberDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

    public List<?> query(String sql) {
        return jdbcTemplate.query(sql, null, new MemberRowMapper());
    }

}
