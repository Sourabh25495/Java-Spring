package org.sourabh.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");
//		Triangle triangle = (Triangle) context.getBean("triangle1");
//		Triangle triangle = (Triangle) context.getBean("triangle2");
		triangle.draw();		
				
		

	}

}
