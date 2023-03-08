package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.dao.Daoimpl;

public class EmployeeTest {

	public static void main(String[] args) {
//Employee employee=new Employee(2, "sauravganguly", 29000.00);

ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
Daoimpl dao=(Daoimpl) context.getBean("dao");
dao.delete(2);
//dao.update(employee);
//dao.save(employee);
System.out.println();
	}

}
