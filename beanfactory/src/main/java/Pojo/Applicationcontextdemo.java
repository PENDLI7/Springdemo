package Pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Applicationcontextdemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Greentingmsg msg=context.getBean(Greentingmsg.class);
		Greentingmsg greentingmsg=new Greentingmsg(1, "jithu");
		System.out.println(msg);
		System.out.println(msg.getId());
	}

}
