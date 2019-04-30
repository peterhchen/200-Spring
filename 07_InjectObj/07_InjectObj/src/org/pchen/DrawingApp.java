package org.pchen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) throws Exception {
		//BeanFactory factory = new XmlBeanFactory (new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext ("spring.xml");
		Triangle t = (Triangle) context.getBean("triangle"); 
		t.draw ();
	}

}
