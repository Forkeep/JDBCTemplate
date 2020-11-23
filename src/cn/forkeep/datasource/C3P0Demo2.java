package cn.forkeep.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo2 {
    public static void main(String[] args) throws SQLException {
        DataSource ds = new ComboPooledDataSource();//创建数据库连接池对象

        for (int i = 0; i < 11; i++) {
            Connection conn = ds.getConnection();//从连接池获取连接对象
            System.out.println(i+":"+conn);
            if (i == 3){
                conn.close();//释放第三个连接，为后边连接让出资源
            }
        }

    }


}
