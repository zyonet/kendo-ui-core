package com.kendoui.spring.controllers.timepicker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("timepicker-navigation-controller")
@RequestMapping(value="/timepicker/")
public class NavigationController {
    
    @RequestMapping(value = {"/navigation"}, method = RequestMethod.GET)
    public String index() {       
        return "timepicker/navigation";
    }    
}