package com.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.dao.ServiceDao;
import com.training.entity.ServiceRequest;

@Controller
@RequestMapping("AddRequest")
// @RequestMapping("/")
public class ServiceRequestController {

    @Autowired
    private ModelAndView mdlView;

    @Autowired
    private ServiceRequest serviceRequest;

    @Autowired
    private ServiceDao dao;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView initForm() {

        mdlView.setViewName("AddRequest");

        mdlView.addObject("command", serviceRequest);

        return mdlView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@ModelAttribute("command") ServiceRequest serviceRequest) {

        int rowsAdded = dao.add(serviceRequest);

        System.out.println("rows added: " + rowsAdded);

        return "ViewRequest";

    }

    @RequestMapping(value = "findRequest", method = RequestMethod.POST)
    public String findCustomer(@RequestParam("key") long key, Model model) {
        ServiceRequest serviceRequest = dao.find(key);

        model.addAttribute("serviceRequest", serviceRequest);

        return "ShowServiceRequest";
    }

    @RequestMapping(value = "findAllRequests", method = RequestMethod.GET)
    public String findAllRequests(Model model) {
        List<ServiceRequest> serviceRequestList = dao.findAll();

        model.addAttribute("serviceRequestList", serviceRequestList);

        return "ShowAllServiceRequests";
    }

}
