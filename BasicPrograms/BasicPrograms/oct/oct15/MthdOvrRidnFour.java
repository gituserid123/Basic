package oct15;

class music {
	void composer() {
		System.out.println("King of 80s-90s music - Ilayaraja");
	}
}

public class MthdOvrRidnFour extends music {

	void composer() {
		System.out.println("King of 90s-2000s music - Rahman");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MthdOvrRidnFour mtf = new MthdOvrRidnFour();
		mtf.composer();

	}

}
