package in.ineuron.comp;

public class Dtdc implements Courier {

	static {
		System.out.println("Dtdc class loading...");
	}
	@Override
	public void delivery() {

		System.out.println("DTDC Delivery");
	}

}
