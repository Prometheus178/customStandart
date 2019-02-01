package org.controller;

import org.model.Person;
import org.services.PersonService;
import org.services.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@Controller

public class Hello {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String printHello(Model model, Locale locale){
        model.addAttribute("message", "hello from controller");
        System.out.println(locale.getDisplayLanguage());
        return "index";
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public ModelAndView addPerson(@RequestParam String name, Person person) throws Exception{
        ModelAndView modelAndView = new ModelAndView("index");

        try {
            person.setName(name);
            personService.addPerson(person);

            modelAndView.addObject("message", "Person added with name: " + person.getName());
        }catch (Exception ex){

        }
        return modelAndView;
    }
}
