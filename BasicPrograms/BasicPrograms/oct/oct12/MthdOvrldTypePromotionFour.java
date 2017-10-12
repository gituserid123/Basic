package oct12;

class ovrldtp {
	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(double a, float b, int c) {
		System.out.println(a + b - c);
	}
}

public class MthdOvrldTypePromotionFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ovrldtp ot = new ovrldtp();
		ot.add(3, 8);
		ot.add(2.5, 1.3f, 1);

	}

}
