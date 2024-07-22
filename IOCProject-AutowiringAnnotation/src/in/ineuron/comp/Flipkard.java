package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkard {
	
	@Autowired
	@Qualifier("bdart")
	private Courier courier;
	private Float discount;
	
	static {
		System.out.println("Flipkard class loading ..");
	}
	
	public Flipkard() {
	 System.out.println("Flipkard object instantiated..");
	}
	public Courier getCourier() {
		return courier;
	}
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	public Float getDiscount() {
		return discount;
	}
	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Flipkard [courier=" + courier + ", discount=" + discount + "]";
	}
	

}
