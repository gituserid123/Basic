package oct27;

class typeprm {

	void adden(int a, int b) {
		System.out.println("Integers");
	}

	void adden(double a, double b) {
		System.out.println("double values");
	}
}

public class MthdOvldTypeProm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typeprm tp = new typeprm();
		tp.adden(1, 2);
		tp.adden(1.1, 2.2);
	}

}
