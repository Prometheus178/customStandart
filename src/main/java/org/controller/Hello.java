package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller

public class Hello {


    @RequestMapping("/")
    public String printHello(Model model, Locale locale){
        model.addAttribute("message", "hello from controller");
        System.out.println(locale.getDisplayLanguage());
        return "index";
    }

}
