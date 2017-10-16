package oct16;

class Bank {
	int interest() {

		return 0;
	}
}

class ICICI extends Bank {
	int interest() {
		return 6;
	}
}

class SBI extends Bank {
	int interest() {
		return 7;
	}
}

class HDFC extends Bank {
	int interest() {
		return 8;
	}
}

public class MthdOvrLd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI i = new ICICI();
		SBI sb = new SBI();
		HDFC hd = new HDFC();
		System.out.println("ICICI interest rate: " + i.interest());
		System.out.println("SBI interest rate: " + sb.interest());
		System.out.println("HDFC interest rate: " + hd.interest());

	}

}
