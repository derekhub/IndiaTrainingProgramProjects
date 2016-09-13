package org.service.daos;

import java.io.Serializable;

import org.service.entitiy.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartDao {

    @Autowired
    HibernateTemplate template;

    public Object add(ShoppingCart object) {
        Object key = template.save(object);
        return key;

    }

    public ShoppingCart find(Serializable key) {
        return null;

    }

}
