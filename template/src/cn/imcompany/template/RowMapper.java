package cn.imcompany.template;

import java.sql.ResultSet;

/**
 * Created by tomyli on 2018/6/22.
 * Github: https://github.com/peng051410
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum);
}
