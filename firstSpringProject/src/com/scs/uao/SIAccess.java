package com.scs.uao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scs.bao.SILogic;
import com.scs.dao.SI;

public class SIAccess {

	public static void main(String[] args) {
		 {
		       // Resource res = new ClassPathResource("applicationContext.xml");
		      //  BeanFactory bf = new XmlBeanFactory(res);
		        ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		        SI s = (SI)bf.getBean("si");
		        float output = new SILogic().CalculateSI(s.getP(),s.getR(),s.getT());
		        System.out.println(output);
		    }

	}

}
