package nov09;

public class ParametrizedCnstr {
	int id;
	String name;

	ParametrizedCnstr(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		ParametrizedCnstr prc = new ParametrizedCnstr(11, "Eleven");

		prc.display();
	}
}
