package com.training.tryingjdbcstuff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String onSubmit(@ModelAttribute("customerAdded") Customer customer) throws DuplicateKeyException {

        int rowsAdded = dao.add(customer);

        System.out.println("rows added: " + rowsAdded);

        return "WelcomeCustomer";
    }

    // ------------------------- new stuff ---------------------------

    @RequestMapping(value = "findCustomer", method = RequestMethod.POST)
    public String findCustomer(@RequestParam("key") long key, Model model) {
        Customer foundCustomer = dao.find(key);

        model.addAttribute("foundCustomer", foundCustomer);

        return "ShowCustomer";
    }

    @RequestMapping(value = "findAllCustomers", method = RequestMethod.GET)
    public String findAllCustomers(Model model) {
        List<Customer> customerList = dao.findAll();

        model.addAttribute("customerList", customerList);

        return "ShowAllCustomer";
    }

}
