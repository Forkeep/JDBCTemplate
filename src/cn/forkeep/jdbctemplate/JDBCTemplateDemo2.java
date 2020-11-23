package cn.forkeep.jdbctemplate;

import cn.forkeep.domain.User;
import cn.forkeep.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class JDBCTemplateDemo2 {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Test()
    public void test1() {
//        更新数据
        String sql = "update user set name=? where id=1";
        int flag = jdbcTemplate.update(sql, "xiaoming");
        System.out.println(flag);
    }

    @Test()
    public void test2() {
//        添加数据
        String sql = "insert into user(id,name,age,password) values (?,?,?,?)";
        int flag = jdbcTemplate.update(sql, null, "xiaohong", 22, "qwerwevlkasdkj");
        System.out.println(flag);
    }

    @Test()
    public void test3() {
        String sql = "select * from user where name=?";
        Map<String, Object> map = jdbcTemplate.queryForMap(sql, "xiaohong");
        System.out.println(map);
    }

    @Test()
    public void test4() {
        String sql = "select * from user";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    @Test()
    public void test5() {
        String sql = "select count(*) from user";
        Long total = jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println(total);
    }

    @Test()
    public void test6(){
        String sql = "select * from user";
        List<User> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));
        for (User u:list){
            System.out.println(u);
        }
    }
}
