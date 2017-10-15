package oct15;

class bank {
	int interest() {
		return 0;
	}
}

class SBI extends bank {
	int interest() {
		return 7;
	}
}

class ICICI extends bank {
	int interest() {
		return 6;
	}
}

class Axis extends bank {
	int interest() {
		return 8;
	}
}

class BankXmpleMthdOvrRidn {

	public static void main(String[] args) {

		SBI s = new SBI();
		ICICI i = new ICICI();
		Axis a = new Axis();

		System.out.println("SBI Interest: " + s.interest());
		System.out.println("ICICI Interest: "+i.interest());
		System.out.println("Axis Interest: "+a.interest());
	}

}
