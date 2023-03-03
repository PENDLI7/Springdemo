package Pojo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Cient {

	public static void main(String[] args) {
Resource resource=new ClassPathResource("spring.xml");
BeanFactory beanfactory=new XmlBeanFactory(resource);

Greentingmsg greentingmsg=(Greentingmsg)beanfactory.getBean("Greentingmsg");
System.out.println("1.............");

}
	}


