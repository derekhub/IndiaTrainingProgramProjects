package com.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.domains.Food;

@Controller
@RequestMapping("/addFood")
public class FoodController {

    @Autowired
    private ModelAndView mdlView;

    @Autowired
    private Food food;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView initForm() {

        mdlView.setViewName("AddFood");

        mdlView.addObject("command", food);

        return mdlView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@ModelAttribute("itemAdded") Food food) {
        return "Welcome";
    }

}
