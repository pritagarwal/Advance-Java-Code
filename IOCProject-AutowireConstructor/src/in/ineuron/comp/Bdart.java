package in.ineuron.comp;

public class Bdart implements Courier {

	static {
		System.out.println("Bdart class loading...");
	}
	@Override
	public void delivery() {

		System.out.println("BlueDart Delivery");
	}

}
