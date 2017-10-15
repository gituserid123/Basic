package oct15;

class additn {

	static int addition(int a, int b) {
		return a + b;
	}
	static int addition(int a, int b ,int c){
		return a+b+c;
	}

}

public class MthdOvrldChangNoOfParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(additn.addition(1, 3));
		System.out.println(additn.addition(1, 2, 3));

	}

}
