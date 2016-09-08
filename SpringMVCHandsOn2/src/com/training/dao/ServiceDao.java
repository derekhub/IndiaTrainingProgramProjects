package com.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.training.entity.ServiceRequest;

@Component
public class ServiceDao {

    @Autowired
    BeanPropertyRowMapper<ServiceRequest> mapper;

    @Autowired
    private JdbcTemplate template;

    public int add(ServiceRequest object) {

        String sql = "insert into servicerequest values(?,?,?,?)";

        int rowsInserted = template.update(sql, object.getRequestId(), object.getRequestType(), object.getDescription(),
                object.getCustomerId());

        return rowsInserted;
    }

    public ServiceRequest find(long key) {
        String sql = "select * from servicerequest where requestId=?";
        ServiceRequest servicerequest = template.queryForObject(sql, mapper, key);
        return servicerequest;
    }

    public List<ServiceRequest> findAll() {
        ArrayList<ServiceRequest> alist = new ArrayList<ServiceRequest>();
        String sql = "select * from servicerequest";
        alist = (ArrayList<ServiceRequest>) template.query(sql, mapper);
        return alist;
    }

}
