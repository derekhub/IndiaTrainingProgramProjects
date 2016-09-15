package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.daos.DonorDao;
import com.training.daos.ProjectDao;
import com.training.domains.Project;

@Controller
public class MainController {

    @Autowired
    private ModelAndView mdlView;
    @Autowired
    private DonorDao donorDAO;

    @Autowired
    ProjectDao projectDAO;

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

    @RequestMapping("/getProjects")
    public ModelAndView getProjects() {

        List<Project> projList = projectDAO.findAll();

        System.out.println(projList);

        mdlView.addObject("projectsList", projList);
        mdlView.setViewName("AllProjects");
        return mdlView;
    }

    @RequestMapping(value = "/getProject/{projectID}")
    public ModelAndView getProject(@PathVariable("projectID") long projectID) {
        mdlView.addObject("projectID", projectID);
        mdlView.setViewName("Project");

        Project obtainedProject = projectDAO.find(projectID);
        mdlView.addObject("Project", obtainedProject);
        return mdlView;
    }

    @RequestMapping(value = "/Donors/{projectID}")
    public ModelAndView getDonor(@PathVariable("projectID") String projectID) {

        // COME BACK TO THIS
        // DonorDao dao = new DonorDao();
        // dao.findByProject(key)

        mdlView.addObject("projectID", projectID);
        mdlView.setViewName("Donors");
        return mdlView;
    }

}