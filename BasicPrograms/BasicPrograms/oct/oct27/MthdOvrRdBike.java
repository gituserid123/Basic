package oct27;

class Bike {
	void speed() {
		System.out.println("Bike is running");
	}
}

class Splendor extends Bike {
	void speed() {
		System.out.println("Bike running at 70");
	}
}

public class MthdOvrRdBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Splendor sp = new Splendor();
		sp.speed();

	}

}
