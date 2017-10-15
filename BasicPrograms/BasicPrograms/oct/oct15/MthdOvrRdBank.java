package oct15;

class BankRate {

	float interest() {
		return 0.0f;
	}
}

class Dena extends BankRate {
	float interest() {
		return 6.8f;
	}
}

class Mudhra extends BankRate {
	float interest() {
		return 6.75f;
	}
}

class Vijaya extends BankRate {
	float interest() {
		return 6.5f;
	}
}

class Allbd extends BankRate {
	float interest() {
		return 6.68f;
	}
}

public class MthdOvrRdBank extends BankRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dena dn = new Dena();
		Mudhra md = new Mudhra();
		Vijaya vj = new Vijaya();
		Allbd al = new Allbd();

		System.out.println("Dena Interest rate:" + dn.interest());
		System.out.println("Mudhra Interest rate:" + md.interest());
		System.out.println("Vijaya Interest rate:" + vj.interest());
		System.out.println("Allabhd Interest rate:" + al.interest());

	}

}
