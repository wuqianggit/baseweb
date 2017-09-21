package com.study.service;

import com.study.domain.User;

/**
 *
 * com.study.service
 *
 * 2017/9/21-7:38
 * 2017
 * Created by wuqiang on 2017/9/21.
 */
public interface UserService {
    void addUser(User user);
    User findUserById(Integer id);
}
