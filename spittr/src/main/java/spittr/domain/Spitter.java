package spittr.domain;

import javax.persistence.*;

/**
 *
 * spittr.domain
 *
 * 实体类
 * 2017/9/19-21:05
 * 2017
 * Created by wuqiang on 2017/9/19.
 */
@Entity
@Table(name = "spitter")
public class Spitter {
    private Integer id;
    private String username;
    private String password;

    @Column(name = "id")
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "user_name",length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Column(name = "password",length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
