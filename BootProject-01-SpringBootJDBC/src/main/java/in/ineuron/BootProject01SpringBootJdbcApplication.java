package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.dao.DAOImpl;

@SpringBootApplication
public class BootProject01SpringBootJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext conatiner = SpringApplication.run(BootProject01SpringBootJdbcApplication.class, args);
	
		DAOImpl dao = conatiner.getBean("dao",DAOImpl.class);
		dao.fetchEmpNameById(2);
	
	
	}

}
