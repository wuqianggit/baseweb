package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * spittr.web
 *
 * 2017/9/18-19:49
 * 2017
 * Created by wuqiang on 2017/9/18.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/",method = RequestMethod.GET) //处理对"/"的请求
    public String home(){
        return "home"; //视图名称 为"home";
    }
}
