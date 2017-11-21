package nov09;

interface motion {
	void walk();
}

public class SingleInherit implements motion {
	public void walk() {
		System.out.println("Keep walking");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInherit si = new SingleInherit();
		si.walk();
	}

}
