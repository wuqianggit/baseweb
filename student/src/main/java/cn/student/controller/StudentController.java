package cn.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * cn.student.controller
 *
 * 2017/9/17-19:05
 * 2017
 * Created by wuqiang on 2017/9/17.
 */
@Controller
public class StudentController {

    private String studentList="/studentList";


    @RequestMapping("addressView")
    public String addressView(Model model) throws Exception {
        return studentList;
    }
}
