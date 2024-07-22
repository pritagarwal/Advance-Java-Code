package in.ineuron.test;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.CustomerVO;


public class TestApp {

	public static void main(String[] args) throws Exception{
		


		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.out.println("************Container Started***************");
		
		CustomerVO obj = factory.getBean("cs",CustomerVO.class);
		System.out.println(obj);

	   

	}

}
