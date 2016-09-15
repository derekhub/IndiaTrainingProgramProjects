package com.training.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.owlike.genson.Genson;
import com.training.daos.DonorDao;
import com.training.daos.ProjectDao;
import com.training.domains.Donor;

@RestController
public class ViewDonorController {
    @Autowired
    private ModelAndView mdlView;

    @Autowired
    private DonorDao donorDAO;
    // projectDAO
    @Autowired
    private ProjectDao projectDAO;

    // takes in a project and redirects to the viewDonor page
    @RequestMapping(value = "/ViewDonor/{projectID}")
    @ResponseBody
    public String getDonors(@PathVariable("projectID") long projectID) {
        // get the donations for the projectID
        // get the donors info
        // put them in two different lists
        List<Donor> donorList = (List<Donor>) donorDAO.findByProject2(projectID);

        Map<String, List> output = new HashMap<String, List>();

        output.put("ListofDonors", donorList);
        Genson serializer = new Genson();

        return serializer.serialize(output);
    }
}
