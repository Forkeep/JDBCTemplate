package cn.forkeep.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo1 {
    public static void main(String[] args) throws SQLException {
        DataSource ds = new ComboPooledDataSource();// 创建数据库连接池对象
        Connection conn = ds.getConnection();// 从连接池对象获取一个数据库连接对象
        System.out.println(conn);//打印出连接对象（com.mchange.v2.c3p0.impl.NewProxyConnection@2b80d80f [wrapping: com.mysql.jdbc.JDBC4Connection@3ab39c39]）
    }
}
