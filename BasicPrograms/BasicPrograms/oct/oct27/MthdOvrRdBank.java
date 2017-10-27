package oct27;

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

class HDFC extends bank {
	int interest() {
		return 8;
	}
}

public class MthdOvrRdBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();
		ICICI i = new ICICI();
		HDFC h = new HDFC();

		System.out.println(s.interest());
		System.out.println(i.interest());
		System.out.println(h.interest());
	}

}
