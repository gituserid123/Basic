package oct12;

class ovrldCalc {
	void sum(int a, long b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

public class MthdOvrldTypePromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ovrldCalc  ov = new ovrldCalc();
		ov.sum(1, 2);
		ov.sum(5, 6, 8);

	}

}
