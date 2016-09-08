package com.training.randomstuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("/login")
public class LoginController {

    @Autowired
    private ModelAndView mdlView;

    @Autowired
    private User user;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView initForm() {
        mdlView.setViewName("Login");

        mdlView.addObject("command", user);

        return mdlView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@ModelAttribute("login") User usr, Model mdl) {

        return "index";
    }

}
