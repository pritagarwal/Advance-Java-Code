package in.ineuron.test;

import java.util.Date;

import in.ineuron.comp.WishMessageGenerator;

public class UsingCoreJavaApp {
	public static void main(String[] args) {
		
		//First dependent object is created
		 Date d = new Date();
		//Target object is created
		WishMessageGenerator generator = new WishMessageGenerator(d);
		System.out.println("Target Object Before Setter Injection is :: " + generator);

		System.out.println("Target Object after Setter Injection :: " + generator);

		System.out.println();
		
		String result = generator.generateMessage("sachin");
		System.out.println(result);

	}

}
