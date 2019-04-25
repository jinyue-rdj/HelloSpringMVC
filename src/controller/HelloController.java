package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;


@Controller
public class HelloController {
    @RequestMapping("hello.do")
    public ModelAndView hello() {
        //ModelAndView mv = new ModelAndView("web/index.jsp");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello Spring MVC");
        mv.setViewName("index.jsp");
        return mv;
    }

    @RequestMapping("hello2.do")
    public ModelAndView hello2(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "hello2");
        mv.setViewName("index.jsp");
        return mv;
    }
}
