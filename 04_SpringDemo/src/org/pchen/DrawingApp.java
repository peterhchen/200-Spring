package org.pchen;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) throws Exception {
		//System.out.println ("Hello");
		// Since we are going to use Bean Factory, 
		// comment out the Triangular instantiation.
		//Triangle triangle = new Triangle ();
		// BeanFactory() is depreciated, use ApplicationContext() instead.
		// XmlBeanFactory is depreciated, use ClassPathXmlApplicationContext()
		//BeanFactory factory = new XmlBeanFactory (new FileSystemResource("spring.xml"));
		
		//ApplicationContext factory = new ClassPathXmlApplicationContext ("spring.xml");
		// getBean from id=triangle defined in spring.xml.Tell the factory the id to get Object.
		// Cast the object into Triangle class type.

		ApplicationContext factory = new ClassPathXmlApplicationContext ("spring.xml");
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw ();
		
		
	}

}
