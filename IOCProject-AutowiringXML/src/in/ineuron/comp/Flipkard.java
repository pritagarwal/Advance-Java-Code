package in.ineuron.comp;

public class Flipkard {
	
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
