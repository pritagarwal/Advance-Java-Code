package in.ineuron.comp;

import java.util.*;
public class WishMessageGenerator {
	
	private Date date;
	
	static {
		System.out.println("WishMessageGenerator class loading");
	}
	
	public void setDate(Date date)
	{
		this.date = date;
	}
	
	//business logic
	public String generateMessage(String userName) {
		@SuppressWarnings("deprecation")
		int hour = date.getHours();// get hour in 24 hour format

		if (hour < 12) {
			return "Good Morning :: " + userName;
		} else if (hour < 16) {
			return "Good AfterNoon :: " + userName;
		} else if (hour < 20) {
			return "Good Evening ::  " + userName;
		} else {
			return "Good Night :: " + userName;
		}
	}

	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}


}
