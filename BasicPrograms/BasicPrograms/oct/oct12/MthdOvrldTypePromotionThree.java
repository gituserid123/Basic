package oct12;

class ovrldtypeprom {
	void sum(int a, double b) {
		System.out.println(a + b);
	}

	void sum(int a, float b, double c) {
		System.out.println(a + b - c);

	}
}

public class MthdOvrldTypePromotionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ovrldtypeprom otp = new ovrldtypeprom();
		otp.sum(2, 2);
		otp.sum(1, 5f, 6.9);
	}

}
