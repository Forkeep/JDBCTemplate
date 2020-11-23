package cn.forkeep.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    private static DataSource dataSource;

    static {
        Properties properties = new Properties();
        try {
//            载入配置文件
            properties.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
//            获取连接池对象
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
// 获取数据库连接对象
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
// 获取数据库连接池对象
    public static DataSource getDataSource() {
        return dataSource;
    }

    public static void close(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }

        if (statement != null) {
            statement.close();
        }

        if (connection != null) {
            connection.close();
        }
    }

    public static void close(Statement statement, Connection connection) throws SQLException {
        close(null, statement, connection);
    }
}
