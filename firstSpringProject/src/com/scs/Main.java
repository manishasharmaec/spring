package com.scs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
		 Resource res = new ClassPathResource("applicationContext.xml");
	        BeanFactory factory = new XmlBeanFactory(res);
	        Student s = (Student) factory.getBean("stu");
	       // s.setRno(1002);
	        //s.setSname(" Manisha sharma");
	        System.out.println(s.getRno() + "" +s.getSname());
	}

}
