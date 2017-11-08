package nov08;

abstract class bank {
	abstract void roi();
}

class CITI extends bank {
	void roi() {
		System.out.println("9.7% interest");
	}
}

class BOFA extends bank {
	void roi() {
		System.out.println("9.75% interest");
	}
}

public class AbstractClassBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CITI ct = new CITI();
		BOFA bf = new BOFA();

		ct.roi();
		bf.roi();
	}

}
