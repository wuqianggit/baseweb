package com.study.service;

import com.study.domain.User;

/**
 *
 * com.study
 *
 * 2017/9/20-22:39
 * 2017
 * Created by wuqiang on 2017/9/20.
 */
public interface UserService {
    void addUser(User user);
    User findUserById(Integer id);
}
