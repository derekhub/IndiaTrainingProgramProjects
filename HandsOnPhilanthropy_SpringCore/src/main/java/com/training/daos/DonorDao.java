package com.training.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.training.domains.Donor;

@Component("dao")
public class DonorDao {

    @Autowired
    BeanPropertyRowMapper<Donor> mapper;

    @Autowired
    private JdbcTemplate template;

    public int add(Donor object) {

        String sql = "insert into donor values(?,?,?,?)";

        int rowsInserted = template.update(sql, object.getHandPhone(), object.getDonorName(), object.getEmail(),
                object.getAddress());

        return rowsInserted;
    }

    public Donor find(long key) {
        String sql = "select * from donor where handphone=?";
        Donor donor = template.queryForObject(sql, mapper, key);
        return donor;
    }

    // public List findAll() {
    // ArrayList<Customer> alist = new ArrayList<Customer>();
    // String sql = "select * from customer";
    // alist = (ArrayList<Customer>) template.query(sql, mapper);
    // return alist;
    // }

}
