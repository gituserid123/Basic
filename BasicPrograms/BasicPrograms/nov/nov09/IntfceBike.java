package nov09;

interface bike {
	void run();
}

class Splendor implements bike {
	public void run() {
		System.out.println("Splendor is running");
	}
}

class Hunk implements bike {
	public void run() {
		System.out.println("Hunk is running");
	}
}

public class IntfceBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Splendor sp = new Splendor();
		Hunk hk = new Hunk();
		sp.run();
		hk.run();
	}

}
