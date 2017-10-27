package oct27;

class addone {
	static int addg(int a, int b) {
		return a + b;
	}

	static int addg(int a, int b, int c) {
		return a + b + c;
	}
}

public class MthdOvrldChngNoOfparam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addone.addg(1, 2));
		System.out.println(addone.addg(3, 4, 5));

	}

}
