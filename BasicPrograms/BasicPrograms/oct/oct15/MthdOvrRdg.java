package oct15;

class HumansOne {
	void maleone() {
		System.out.println("Strong");
	}
}

public class MthdOvrRdg extends HumansOne {
	void maleone() {
		System.out.println("Average");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MthdOvrRdg fm = new MthdOvrRdg();
		fm.maleone();

	}

}
