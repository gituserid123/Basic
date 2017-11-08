package nov08;

public class PrmtrzdCnstr {

	int id;
	String name;

	PrmtrzdCnstr(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println("name:-" + name + " id:-" + id);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrmtrzdCnstr pc = new PrmtrzdCnstr(10, "Ten");
		pc.display();
	}

}
