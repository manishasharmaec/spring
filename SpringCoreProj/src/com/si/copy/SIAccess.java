package com.si.copy;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SIAccess {

	public static void main(String[] args) 
	{
		// Resource res = new ClassPathResource("applicationContext.xml");
	      //  BeanFactory bf = new XmlBeanFactory(res);
	        ApplicationContext bf = new ClassPathXmlApplicationContext("applicationcontext.xml");
	        SI s = (SI)bf.getBean("si");
	        float output = new SIlLogic().CalculateSI(s.getP(),s.getR(),s.getT());
	        System.out.println(output);
	    }

	}


