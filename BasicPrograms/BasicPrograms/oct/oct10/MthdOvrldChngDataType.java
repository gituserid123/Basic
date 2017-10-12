package oct10;

class addi {

	static int addd(int a, int b) {
		return a + b;

	}

	static double addd(double a, double b) {
		return a + b;
	}
}

public class MthdOvrldChngDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addi.addd(2.1, 3.2));
		System.out.println(addi.addd(1, 5));

	}

}
