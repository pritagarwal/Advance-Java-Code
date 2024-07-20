package in.ineuron.test;

import java.io.IOException;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

public class ConstructorInjectionApp {
	
	public static void usingApplicationContext() throws IOException
	{
		System.out.println("***********BeanFactory container starting************");
		ApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("***********BeanFactory container started*************");
		System.in.read();
		
		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("Hashcode value of wmg is :: " + wmg.hashCode());
		System.out.println(wmg);
		String result = wmg.generateMessage("sachin");
		System.out.println(result + "\n");

		WishMessageGenerator wmg1 = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("HashCode value of wmg1 is :: " + wmg1.hashCode());
		System.out.println(wmg1);
		String result1 = wmg1.generateMessage("kohli");
		System.out.println(result1);

		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		
		usingApplicationContext();
		System.out.println("*******Container is closing**********");


		
		
		
	
		
		
	}

}
