package cn.forkeep.jdbctemplate;

import cn.forkeep.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTDemo1 {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());//创建jdbctemplate对象
        String sql = "insert into user (id,name,age,password) values (?,?,?,?)";
        int flag = jdbcTemplate.update(sql,null,"wangwu",33,"asdlawkqjw");
        System.out.println(flag);

    }
}
