package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class SecondController {



    @RequestMapping(value = "/second",method = RequestMethod.GET )
    public String secondPageView(Model model){
        model.addAttribute("message", "Hello from second controller ");
        return "second";
    }

    public static String name;

    @RequestMapping(value = "/third", method = RequestMethod.POST)
    public String helloWithName(@RequestParam(value = "inputName") String inputName, Model model ){

        name = inputName;
        model.addAttribute("messageHello", "Hello " + inputName);
        return "third";
    }

    @RequestMapping(value = "/four", method = RequestMethod.GET)
    public String getInputName(@PathVariable String inputName){


        return "four";
    }
}
