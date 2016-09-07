package com.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.ServiceRequest;

@Controller
@RequestMapping("/AddRequest")
// @RequestMapping("/")
public class ServiceRequestController {

    @Autowired
    private ModelAndView mdlView;

    @Autowired
    private ServiceRequest serviceRequest;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView initForm() {

        mdlView.setViewName("AddRequest");

        mdlView.addObject("command", serviceRequest);

        return mdlView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@ModelAttribute("command") ServiceRequest serviceRequest) {

        return "ViewRequest";

    }

}
