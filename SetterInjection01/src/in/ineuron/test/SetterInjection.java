package in.ineuron.test;

import java.io.IOException;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class SetterInjection {
	
	public static void usingBeanFactory() throws IOException
	{
		//Activate the container
				FileSystemResource resource = new FileSystemResource("src/in/ineuron/cfg/applicationContext.xml");
				System.out.println("***********BeanFactory container starting************");
				@SuppressWarnings("deprecation")
				XmlBeanFactory factory = new XmlBeanFactory(resource);
				System.out.println("***********BeanFactory container started*************");

				System.in.read();
				
				//Get the Java Bean
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
	
	public static void usingApplicationContext() throws IOException
	{
		System.out.println("***********BeanFactory container starting************");
		@SuppressWarnings("resource")
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
		
		//usingBeanFactory();
		usingApplicationContext();
		
		//Close the Container
		System.out.println("*******Container is closing**********");


		
		
		
	
		
		
	}

}
