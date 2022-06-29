package com.mani.placements;

import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	
	public static void main(String[] args) {
		
		//TriangleDraw tr = new TriangleDraw();
		//tr.draw();
		//@SuppressWarnings("deprecation")
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));//--------->Depricated, xml file outside src
		ApplicationContext context = new ClassPathXmlApplicationContext("/**/app.xml");
	    BeanFactory factory = context;
	    TriangleDraw tr = (TriangleDraw)factory.getBean("Triangle");
	    tr.draw();
	}

}
