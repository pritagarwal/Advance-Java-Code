package in.ineuron.bo;

import org.springframework.stereotype.Component;

@Component
public class CustomerBO {

	private String customerName;
	private String customerAddress;

	private Float pamt;
	private Float rate;
	private Float time;
	private Float intrAmount;
	
	static {
		System.out.println("CustomerBO class loading...");
	}
	
     public CustomerBO() {
          System.out.println("CustomerBO instantiated....");
     }
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Float getPamt() {
		return pamt;
	}
	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	

	public Float getIntrAmount() {
		return intrAmount;
	}
	public void setIntrAmount(Float intrAmount) {
		this.intrAmount = intrAmount;
	}
	
	
	
}
