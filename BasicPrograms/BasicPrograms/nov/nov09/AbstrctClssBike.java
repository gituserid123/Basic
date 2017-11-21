package nov09;

abstract class drive {
	void start() {
		System.out.println("start bike");
	}

	abstract void move();

	void grchng() {
		System.out.println("chng gr");
	}
}

public class AbstrctClssBike extends drive {

	public void move() {
		System.out.println("bike is moving");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstrctClssBike acb = new AbstrctClssBike();
		acb.start();
		acb.move();
		acb.grchng();
	}

}
