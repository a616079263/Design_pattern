package zc.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/3/6.
 */
public class HelloController {

    @Controller
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public class HelloController {

        @RequestMapping(value = "/hello", method = RequestMethod.GET)
        public String printHello(ModelMap model) {
            model.addAttribute("msg", "Spring MVC Hello World");
            model.addAttribute("name", "yuntao");
            return "/index";
        }
    }

}
