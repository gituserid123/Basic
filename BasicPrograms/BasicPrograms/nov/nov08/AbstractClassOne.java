package nov08;

abstract class classone {
	abstract void methodone();

}

public class AbstractClassOne extends classone {

	void methodone() {
		System.out.println("implementing method one");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassOne aco = new AbstractClassOne();
		aco.methodone();
	}

}
