package cn.imcompany.template;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by tomyli on 2018/6/21.
 * Github: https://github.com/peng051410
 */
public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> query(String sql, Object[] values, RowMapper rowMapper) {

        try {
            Connection connection = getConnection();
            PreparedStatement statement = getStatement(connection, sql);
            ResultSet rs = executeQuery(statement, values);

            List<Object> list = parseResultSet(rs, rowMapper);
            closeResultSet(rs);
            closeStatement(statement);
            closeConnection(connection);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();

    }

    private List<Object> parseResultSet(ResultSet rs, RowMapper mapper) throws SQLException {

        List<Object> list = new ArrayList<>();
        int num = 0;
        while (rs.next()) {
            list.add(mapper.mapRow(rs, num++));
        }
        return list;
    }

    private void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

    private void closeStatement(Statement statement) throws SQLException {
        statement.close();
    }

    private void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    private ResultSet executeQuery(PreparedStatement statement, Object[] values) throws SQLException {

        for (int i = 0; i < values.length; i++) {
            statement.setObject(i, values[i]);
        }
        return statement.executeQuery();
    }

    private PreparedStatement getStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    private Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
