package Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Address;
import pojo.Employee;

public class Test {

	public static void main(String[] args) {
ApplicationContext contect=new ClassPathXmlApplicationContext("spring.xml");
//Address ad=new Address(1, "hyderabad", "ts");
//Employee employee=new Employee(1, "jithu", 24000, ad);
Employee employee=(Employee) contect.getBean("employee");
System.out.println(employee);
	}

}
