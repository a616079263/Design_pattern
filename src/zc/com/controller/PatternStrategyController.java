package zc.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/3/6.
 */
@Controller
@RequestMapping(value = "/pattern", method = RequestMethod.GET)
public class PatternStrategyController {
        //策略模式
        @RequestMapping(value = "/strategy", method = RequestMethod.GET)
        public String patternStrategy(ModelMap model) {

            return "patternStrategy/pattern_strategy";
        }

}
