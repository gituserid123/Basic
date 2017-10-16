package oct16;

class multiplicn {
	static int multiply(int a, int b) {
		return a * b;
	}

	static int multiply(int a, int b, int c) {
		return a * b * c;
	}
}

public class MthdOvrldChngNoOfParamTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiplicn.multiply(2, 3));
		System.out.println(multiplicn.multiply(3, 4, 5));

	}

}
