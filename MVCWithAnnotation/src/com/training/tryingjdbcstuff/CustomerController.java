package com.training.tryingjdbcstuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.daos.CustomerDao;
import com.training.entity.Customer;

@Controller
@RequestMapping("addCustomer")
@Import({ Customer.class, CustomerDao.class })
public class CustomerController {

    @Autowired
    private ModelAndView mdlView;

    @Autowired
    private Customer customer;

    @Autowired
    private CustomerDao dao;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView initForm() {

        mdlView.setViewName("AddCustomer");

        mdlView.addObject("command", customer);

        return mdlView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@ModelAttribute("customerAdded") Customer customer) {

        int rowsAdded = dao.add(customer);

        System.out.println("rows added: " + rowsAdded);

        return "WelcomeCustomer";
    }

}
