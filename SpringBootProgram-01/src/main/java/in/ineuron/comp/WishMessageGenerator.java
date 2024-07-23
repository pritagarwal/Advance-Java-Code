package in.ineuron.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="wmg")
public class WishMessageGenerator {
	
	static {
		System.out.println("WishMessageGenerator.class loading...");
	}
	
	public WishMessageGenerator() {
           System.out.println("WishMessageGenerator object instantiated...");
	}
	
	//Fields
	@Autowired
	private LocalDateTime date;

	//Business logic
	public String greeting(String name) {
		if(date.getHour()<12)
		
			return "Good Morning "+name;
		
		else if(date.getHour()>=12 && date.getHour()<17)
			return "Good Afternoon "+name;
		else 
			return "Good Night "+name;
	}
}
