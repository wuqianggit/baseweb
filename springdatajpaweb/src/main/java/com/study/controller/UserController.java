package com.study.controller;

import com.study.domain.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * com.study.controller
 *
 * 2017/9/21-7:11
 * 2017
 * Created by wuqiang on 2017/9/21.
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String toIndexView(){
        return "index";
    }

    @RequestMapping(value = "addUser",method = {RequestMethod.GET,RequestMethod.POST})
    public void addUser(User user,HttpServletResponse response){
        try {
            if(user!=null){
                if(!StringUtils.isEmpty(user.getUserName())
                        &&!StringUtils.isEmpty(user.getPassWord())){
                    userService.addUser(user);
                }
            }
            System.out.println("走了 AddUser方法");
            response.getOutputStream().write("成功！yes".getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
