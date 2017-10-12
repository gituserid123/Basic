package oct12;

class addin {
	static int add(int a, int b) {
		return a + b;

	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class MthdOvrldChangNoOfParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addin.add(1, 1));
		System.out.println(addin.add(3, 3, 3));

	}

}
