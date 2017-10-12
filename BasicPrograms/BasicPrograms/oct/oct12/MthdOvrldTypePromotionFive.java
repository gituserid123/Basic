package oct12;

class ovrldTpProm {
	void add(int a, int b) {
		System.out.println(a + b);

	}

	void add(int a, float b, double c) {
		System.out.println(a - b - c);
	}
}

public class MthdOvrldTypePromotionFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ovrldTpProm otprm = new ovrldTpProm();
		otprm.add(1, 4);
		otprm.add(1, 2.3f, 4);

	}

}
