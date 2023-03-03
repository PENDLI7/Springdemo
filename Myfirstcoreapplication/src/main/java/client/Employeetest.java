package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Pojos.Employee;

public class Employeetest {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
Employee employee=(Employee) context.getBean("Employee");

Employee em=new Employee(100, "jithu", 23450.00)	;	
		System.out.println(em);
		
	}

}
