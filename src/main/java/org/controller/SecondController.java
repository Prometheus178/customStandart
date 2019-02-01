package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecondController {

    @RequestMapping(value = "/second",method = RequestMethod.GET)
    public String secondPageView(){
        return "second";
    }
}
