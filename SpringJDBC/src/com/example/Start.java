package com.example;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        CustomerJDBCTemplate customerJDBCTemplate =
                (CustomerJDBCTemplate) context.getBean("customerJDBCTemplate");

        System.out.println("------Records Creation--------");
        customerJDBCTemplate.create(1, "Vignesh", 24);
        customerJDBCTemplate.create(2, "Moni", 23);
        customerJDBCTemplate.create(3, "Anga", 9);

        System.out.println("------Listing Multiple Records--------");
        List<Customer> customers = customerJDBCTemplate.listStudents();
        for (Customer record : customers) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----");
        customerJDBCTemplate.update(2, 20);

        System.out.println("----Listing Record with ID = 2 -----");
        Customer customer = customerJDBCTemplate.getStudent(2);
        System.out.print("ID : " + customer.getId());
        System.out.print(", Name : " + customer.getName());
        System.out.println(", Age : " + customer.getAge());

    }
}
