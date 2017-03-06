package zc.com.pattern.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/3/6.
 */
@Controller
@RequestMapping(value = "/pattern")
public class PatternStaticController {
        //静态工厂模式、简单工厂模式
        @RequestMapping(value = "/static", method = RequestMethod.GET)
        public String patternStrategy(ModelMap model) {

            return "patternStrategy/pattern_strategy";
        }
}
