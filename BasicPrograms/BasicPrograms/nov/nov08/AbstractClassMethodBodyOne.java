package nov08;

abstract class Motorcycle {
	void mcycle() {
		System.out.println("motor cycle started");
	}

	abstract void mrun();

	void mgearchange() {
		System.out.println("Motor cycle gear changed");
	}
}

public class AbstractClassMethodBodyOne extends Motorcycle {
	void mrun() {
		System.out.println("motor cycle running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassMethodBodyOne ao = new AbstractClassMethodBodyOne();
		ao.mcycle();
		ao.mrun();
		ao.mgearchange();
	}

}
