package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello99 {
    @RequestMapping("login.do")
    public ModelAndView login(String username, String password){
        if ("rdj".equals(username) && password.length() > 0) {
            System.out.println(username + "登录成功");
            ModelAndView mv = new ModelAndView();
            mv.addObject("message", "Hello Spring MVC");
            mv.setViewName("index.jsp");
            return mv;
        }
        System.out.println(username + "登录失败");
        return null;
    }
}
