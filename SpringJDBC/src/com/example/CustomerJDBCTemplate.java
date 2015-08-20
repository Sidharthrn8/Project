package com.example;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerJDBCTemplate {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(Integer id, String name, Integer age) {
        String SQL = "insert into Customer (id,name, age) values (?,?, ?)";

        jdbcTemplateObject.update(SQL, id, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }

    public Customer getStudent(Integer id) {
        String SQL = "select * from Customer where id = ?";
        Customer customer = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id}, new CustomerMapper());
        return customer;
    }

    public List<Customer> listStudents() {
        String SQL = "select * from Customer";
        List<Customer> customer = jdbcTemplateObject.query(SQL,
                new CustomerMapper());
        return customer;
    }

    public void delete(Integer id) {
        String SQL = "delete from Customer where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id);
        return;
    }

    public void update(Integer id, Integer age) {
        String SQL = "update Customer set age = ? where id = ?";
        jdbcTemplateObject.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id);
        return;
    }
}
