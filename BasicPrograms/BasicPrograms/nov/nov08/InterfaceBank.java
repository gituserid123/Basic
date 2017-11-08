package nov08;

interface BankRate {
	int interstRate();
}

class SELF implements BankRate {
	public int interstRate() {
		return 7;
	}
}

class OTHER implements BankRate {
	public int interstRate() {
		return 9;
	}
}

public class InterfaceBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SELF sf = new SELF();
		OTHER ot = new OTHER();
		System.out.println(sf.interstRate());
		System.out.println(ot.interstRate());
	}

}
