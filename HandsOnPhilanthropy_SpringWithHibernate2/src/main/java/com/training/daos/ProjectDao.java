package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.training.domains.Project;

@Component
public class ProjectDao {

    @Autowired
    private HibernateTemplate template;

    public Object add(Project object) {
        Object key = template.save(object);
        return key;
    }

    public Project find(Serializable key) {
        String sql = "select * from project where projectid=?";
        Project project = (Project) template.get(Project.class, key);
        return project;
    }

    public List<Project> findAll() {
        String sql = "Select * from project";
        List<Project> list = (List<Project>) template.loadAll(Project.class);
        return list;
    }

}
