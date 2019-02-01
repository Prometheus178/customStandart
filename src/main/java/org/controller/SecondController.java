package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecondController {

    @RequestMapping(value = "/second",method = RequestMethod.GET)
    public String secondPageView(Model model){
        model.addAttribute("message", "Hello from second controller ");
        return "second";
    }

    @RequestMapping(value = "/third/${inputName}", method = RequestMethod.POST)
    public String helloWithName(@PathVariable("inputName")
                                @RequestParam(value = "inputName")
                                String inputName, Model model){
      model.addAttribute("messageHello", "Hello " + inputName);

        return "third";
    }
}
