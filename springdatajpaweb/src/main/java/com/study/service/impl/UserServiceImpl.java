package com.study.service.impl;

import com.study.domain.User;
import com.study.reponsitory.UserReponsitory;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * com.study.service
 *
 * 2017/9/20-22:40
 * 2017
 * Created by wuqiang on 2017/9/20.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserReponsitory dao;

    @Override
    public void addUser(User user) {
        dao.save(user);
    }

    @Override public User findUserById(Integer id) {
        User one = dao.findById(id);
        return one;
    }
}