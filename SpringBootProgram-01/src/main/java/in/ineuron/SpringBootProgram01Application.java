package in.ineuron;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.ineuron.comp.WishMessageGenerator;

@SpringBootApplication
public class SpringBootProgram01Application {

	public static void main(String[] args) {
		ApplicationContext container= SpringApplication.run(SpringBootProgram01Application.class, args);
		
		WishMessageGenerator wmg = container.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wmg.greeting("Prit"));	
		((ConfigurableApplicationContext)container).close();
	}

    @Bean
    LocalDateTime getDate() {
		return LocalDateTime.now();
	}

}
