package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.training.domains.Address;

@Component
public class AddressDao {

    @Autowired
    private HibernateTemplate template;

    public Object add(Address object) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        template = ctx.getBean(HibernateTemplate.class);
        Object key = template.save(object);
        return key;

    }

    public Address find(Serializable key) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        template = ctx.getBean(HibernateTemplate.class);

        String sql = "select * from address where ADDRESSLINE1=?";

        Address address = (Address) template.get(Address.class, key);

        return address;
    }

    public List<Address> findAll() {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        template = ctx.getBean(HibernateTemplate.class);

        String sql = "Select * from address";
        List<Address> list = (List<Address>) template.loadAll(Address.class);
        return list;
    }

}
