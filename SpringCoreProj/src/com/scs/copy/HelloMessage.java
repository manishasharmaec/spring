package com.scs.copy;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class HelloMessage {

	public static void main(String[] args) {
		        Resource res = new ClassPathResource("applicationcontext.xml");
		        BeanFactory factory = new XmlBeanFactory(res);
		        Hello s=(Hello) factory.getBean("stu");
		       
		        s.setMessage("Hello Spring core");
		        System.out.println(s.getMessage());
		    }
		}