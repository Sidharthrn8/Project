package org.mycomapny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manib {
	public static void main(String[] args) {
		
	
//	BeanFactory bean=new XmlBeanFactory(new FileSystemResource("mybean.xml"));
			ApplicationContext bean=new ClassPathXmlApplicationContext("beanb.xml");
			Employee1 e=(Employee1)bean.getBean("employee2");
			e.details();
}
}