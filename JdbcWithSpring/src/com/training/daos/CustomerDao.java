package com.training.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.training.entity.Customer;
import com.training.ifaces.MyDao;

@Component("dao")
public class CustomerDao implements MyDao {

    @Autowired
    private JdbcTemplate template;

    @Override
    public int add(Customer object) {

        String sql = "insert into customer values(?,?,?,?)";

        int rowsInserted = template.update(sql, object.getCustomerNumber(), object.getCustomerName(), object.getEmail(),
                object.getPhoneNUmber());

        return rowsInserted;
    }

}
