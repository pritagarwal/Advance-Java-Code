package in.ineuron.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Flipkard;


public class SetterInjection {

	public static void main(String[] args) throws IOException {

		System.out.println("***********BeanFactory container starting************");
		ApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
	
		Flipkard f = factory.getBean("fkt",Flipkard.class);
		f.getCourier().delivery();
		
		// Close the Container
		System.out.println("*******Container is closing**********");

	}

}
