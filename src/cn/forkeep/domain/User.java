package cn.forkeep.domain;

/**
 * 数据库中，表名：user
 * +----+----------+-----+----------------+
 * | id | name     | age | password       |
 * +----+----------+-----+----------------+
 * |  1 | lisi     |  20 | lsdk1233112    |
 * |  2 | zhangsan |  19 | asdkjalsdjklas |
 * +----+----------+-----+----------------+
 *
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
