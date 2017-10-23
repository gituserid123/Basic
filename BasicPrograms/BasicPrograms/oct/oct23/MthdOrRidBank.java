package oct23;

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

class HDFC extends Bank{
	int interest(){
		return 8;
	}
}

public class MthdOrRidBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI s = new SBI();
		ICICI i = new ICICI();
		HDFC d=new HDFC();
		
		System.out.println("SBI:"+s.interest());
		System.out.println("ICICI:"+i.interest());
		System.out.println("HDFC:"+d.interest());
	}

}
