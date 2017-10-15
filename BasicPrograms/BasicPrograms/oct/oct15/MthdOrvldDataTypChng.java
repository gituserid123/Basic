package oct15;

class addone {
	static int add(int a, int b) {
		return a + b;

	}

	static double add(double a, double b) {
		return a + b;
	}
}

public class MthdOrvldDataTypChng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addone.add(1.2, 3.6));
		System.out.println(addone.add(3, 6));

	}

}
