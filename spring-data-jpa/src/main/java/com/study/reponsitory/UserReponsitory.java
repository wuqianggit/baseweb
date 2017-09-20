package com.study.reponsitory;

import com.study.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * com.study.reponsitory
 *
 * 2017/9/20-22:31
 * 2017
 * Created by wuqiang on 2017/9/20.
 */
@Repository
public interface UserReponsitory extends JpaRepository<User,Integer>{
    User findById(Integer id);
}
