package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * com.study.controller
 *
 * 2017/9/20-20:56
 * 2017
 * Created by wuqiang on 2017/9/20.
 */
@Controller
@RequestMapping("/")
public class StudyController {
    //映射路径
    @RequestMapping(method = RequestMethod.GET) //处理GET请求
    public String toIndexView(){
        return "index";
    }
}
