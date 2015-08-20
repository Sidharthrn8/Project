package org.mycomapny;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainT {
	public static void main(String[] args) {
		
	
//	BeanFactory bean=new XmlBeanFactory(new FileSystemResource("mybean.xml"));
			ApplicationContext bean=new ClassPathXmlApplicationContext("Training.xml");
			TrainingNew e=(TrainingNew)bean.getBean("trainee");
			e.details();
}
}
