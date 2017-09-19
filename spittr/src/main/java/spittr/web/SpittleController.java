package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * spittr.web
 *
 * 2017/9/18-21:01
 * 2017
 * Created by wuqiang on 2017/9/18.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    //查询参数 /spittles?max=123
    @RequestMapping(method = RequestMethod.GET)
    public String spittles(@RequestParam("max") long max){
        System.out.println(max);
        return "spittles";
    }
    //通过路径参数接收查询 即 /spittles/12345 这种路径的方式
    @RequestMapping(value="/{spittleId}",method = RequestMethod.GET)
    public String showSpittle(@PathVariable("spittleId") long spittleId){
        System.out.println(spittleId);
        return "spittle";
    }
}
