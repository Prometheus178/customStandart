package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Hello {
    @RequestMapping("/")
    public String printHello(Model model){
        model.addAttribute("message", "hello from controller");
        return "index";
    }

}
