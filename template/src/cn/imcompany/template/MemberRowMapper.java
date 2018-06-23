package cn.imcompany.template;

import cn.imcompany.template.domain.Member;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by tomyli on 2018/6/22.
 * Github: https://github.com/peng051410
 */
public class MemberRowMapper implements RowMapper<Member> {

    @Override
    public Member mapRow(ResultSet rs, int rowNum) {
        Member member = new Member();
        try {
            member.setName(rs.getString("name"));
            return member;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
