package nov08;

interface drawable {
	void draw();
}

class trapezium implements drawable {
	public void draw() {
		System.out.println("Drawing a trapezium");
	}
}

class septagon implements drawable {
	public void draw() {
		System.out.println("Drawing septagon");
	}
}

public class InterfaceDrawble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		trapezium tz = new trapezium();
		septagon st = new septagon();

		tz.draw();
		st.draw();
	}

}
