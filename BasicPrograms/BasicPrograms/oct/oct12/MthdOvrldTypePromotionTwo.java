package oct12;

class ovrldType {
	void ovrtype(float a, int b) {
		System.out.println(a + b);
	}

	void ovrtype(double a, double b, double c) {
		System.out.println(a + b - c);

	}

}

public class MthdOvrldTypePromotionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ovrldType ot = new ovrldType();
		ot.ovrtype(1.2f, 3);
		ot.ovrtype(2.3, 63.3, 5.8);
	}

}
