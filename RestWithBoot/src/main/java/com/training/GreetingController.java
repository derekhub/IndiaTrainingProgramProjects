package com.training;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.domains.TestReport;

@RestController
public class GreetingController {

    private HashMap<String, TestReport> reports;

    @PostConstruct
    public void init() {

        reports = new HashMap<String, TestReport>();

        reports.put("sep1601", new TestReport(101, "Ramesh", "Blood", "B+"));
        reports.put("sep1602", new TestReport(102, "Rajesh", "Sugar", "100mg"));
        reports.put("sep1603", new TestReport(103, "Sailor", "Water", "Fabulous"));

    }

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to rest using spring booty";
    }

    @RequestMapping("/findAll")
    public Map<String, TestReport> getReports() {
        return reports;
    }

}
