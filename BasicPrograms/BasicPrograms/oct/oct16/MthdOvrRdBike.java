package oct16;

class Bike {
	void run() {
		System.out.println("Bike is running");
	}
}

class Splendor extends Bike {
	void run() {
		System.out.println("Bike running at 60kmph");
	}
}

public class MthdOvrRdBike extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bk = new Splendor();
		bk.run();
	}

}
