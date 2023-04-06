package com.scs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloMessage {
	 public static void main(String[] args) {
	  Resource res = new ClassPathResource("applicationContext.xml");
      BeanFactory factory = new XmlBeanFactory(res);
    Hello s = (Hello) factory.getBean("stu");
    s.setMessage("Hello SpringCore");
    System.out.println(s.getMessage());
}
} 