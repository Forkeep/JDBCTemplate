package cn.forkeep.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo1 {
    public static void main(String[] args) throws Exception {
//        加载配置文件
        Properties props = new Properties();
        InputStream inputStream = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        props.load(inputStream);
//        获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(props);
//        获取数据库连接对象
        Connection conn = ds.getConnection();
        System.out.println(conn);//com.mysql.jdbc.JDBC4Connection@35851384
    }
}
