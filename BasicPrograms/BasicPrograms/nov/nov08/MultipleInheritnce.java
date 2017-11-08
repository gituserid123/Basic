package nov08;

interface walking {
	void walk();
}

interface running {
	void run();
}

public class MultipleInheritnce implements walking, running {

	public void walk() {
		System.out.println("walk first");
	}

	public void run() {
		System.out.println("run later");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritnce mhi = new MultipleInheritnce();
		mhi.walk();
		mhi.run();
	}

}
