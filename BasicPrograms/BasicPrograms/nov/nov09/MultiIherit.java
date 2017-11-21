package nov09;

interface Motorbike {
	void start();
}

interface Mbike {
	void runnin();
}

interface Gearchng {
	void changegr();
}

public class MultiIherit implements Motorbike, Mbike, Gearchng {

	public void start() {
		System.out.println("Bike started");
	}

	public void runnin() {
		System.out.println("Bike is running");

	}

	public void changegr() {
		System.out.println("Change gear");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiIherit mi = new MultiIherit();

		mi.start();
		mi.runnin();
		mi.changegr();

	}

}
