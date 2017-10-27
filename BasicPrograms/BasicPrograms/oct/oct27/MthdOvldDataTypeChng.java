package oct27;

class addee {
	static int addii(int a, int b) {
		return a + b;
	}

	static double addii(double a, double b) {
		return a + b;
	}

}

public class MthdOvldDataTypeChng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addee.addii(1, 3));
		System.out.println(addee.addii(12.2, 3.3));
	}

}
