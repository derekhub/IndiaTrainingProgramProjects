package com.training.daos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.training.entity.Customer;
import com.training.ifaces.MyDao;

@Component("dao")
public class CustomerDao implements MyDao {

    @Autowired
    BeanPropertyRowMapper<Customer> mapper;

    @Autowired
    private JdbcTemplate template;

    @Override
    public int add(Customer object) {

        String sql = "insert into customer values(?,?,?,?)";

        int rowsInserted = template.update(sql, object.getCustomerNumber(), object.getCustomerName(), object.getEmail(),
                object.getPhoneNumber());

        return rowsInserted;
    }

    public Customer find(long key) {
        String sql = "select * from customer where customerNumber=?";
        Customer cust = template.queryForObject(sql, mapper, key);
        return cust;
    }

    @Override
    public List findAll() {
        ArrayList<Customer> alist = new ArrayList<Customer>();
        String sql = "select * from customer";
        alist = (ArrayList<Customer>) template.query(sql, mapper);
        return alist;
    }

}
