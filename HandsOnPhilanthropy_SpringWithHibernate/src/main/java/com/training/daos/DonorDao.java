package com.training.daos;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.training.domains.Donor;

@Component
public class DonorDao {

    @Autowired
    HibernateTemplate template;

    public Object add(Donor object) {
        Object key = template.save(object);
        return key;

    }

    public Donor find(Serializable key) {
        return null;

    }

    // -----------------------------

    // public DonorDao() {
    // super();
    //
    // factory = HiberUtils.getSessionFactory();
    //
    // }
    //
    // public Object add(Donor object) {
    // // TODO Auto-generated method stub
    //
    // long key;
    //
    // Session session = factory.openSession();
    //
    // Transaction tx = session.beginTransaction();
    //
    // key = (long) session.save(object);
    //
    // tx.commit();
    //
    // return key;
    // }
    //
    // public Donor find(Serializable key) {
    //
    // Session session = factory.openSession();
    // Donor donor = (Donor) session.get(Donor.class, key);
    //
    // return donor;
    //
    // }

    // -----------------------------

    // @Autowired
    // BeanPropertyRowMapper<Donor> mapper;
    //
    // @Autowired
    // private JdbcTemplate template;
    //
    // public int add(Donor object) {
    //
    // String sql = "insert into donor values(?,?,?,?)";
    //
    // int rowsInserted = template.update(sql, object.getHandPhone(),
    // object.getDonorName(), object.getEmail(),
    // object.getAddress());
    //
    // return rowsInserted;
    // }
    //
    // public Donor find(long key) {
    // String sql = "select * from donor where handphone=?";
    // Donor donor = template.queryForObject(sql, mapper, key);
    // return donor;
    // }
    //
    // // public List findAll() {
    // // ArrayList<Customer> alist = new ArrayList<Customer>();
    // // String sql = "select * from customer";
    // // alist = (ArrayList<Customer>) template.query(sql, mapper);
    // // return alist;
    // // }

}
