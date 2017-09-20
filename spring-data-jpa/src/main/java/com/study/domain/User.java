package com.study.domain;

import javax.persistence.*;

/**
 *
 * com.study.domain
 *
 * 2017/9/20-22:01
 * 2017
 * Created by wuqiang on 2017/9/20.
 */
@Entity
@Table(name = "user")
public class User {
    private Integer id;
    private String userName;
    private String passWord;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "user_name",length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Column(name = "pass_word",length = 20)
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
