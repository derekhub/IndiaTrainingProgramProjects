package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.training.domains.Donor;

@Component
public class DonorDao {

    @Autowired
    private HibernateTemplate template;

    public Object add(Donor object) {
        Object key = template.save(object);
        return key;
    }

    public Donor find(Serializable key) {
        String sql = "select * from donor where handphone=?";
        Donor donor = (Donor) template.get(Donor.class, key);
        return donor;
    }

    public List<Donor> findAll() {
        String sql = "Select * from donor";
        List<Donor> list = (List<Donor>) template.loadAll(Donor.class);
        return list;
    }

}
