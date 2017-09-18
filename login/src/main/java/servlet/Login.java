package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/9/9.
 */
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        /*
         解决乱码问题，客户端都是 以UTF-8的编码方式，返回到服务器的
         */
        username=new String(username.getBytes("ISO8859-1"),"utf-8");
        System.out.println("username="+username);
        String password=req.getParameter("password");
        if("123".equals(username)&&"abc".equals(password)){
            resp.getOutputStream().println("success");
        }else{
            resp.getOutputStream().println("falure");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post方式登录：");
        this.doGet(req,resp);
    }
}
