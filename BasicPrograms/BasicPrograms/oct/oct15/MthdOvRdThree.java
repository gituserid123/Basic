package oct15;

class sound {
	void instrument() {
		System.out.println("Veena - Classical");
	}
}

public class MthdOvRdThree extends sound {

	void instrument() {
		System.out.println("Guitar - Current");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MthdOvRdThree mthdr = new MthdOvRdThree();
		mthdr.instrument();

	}

}
