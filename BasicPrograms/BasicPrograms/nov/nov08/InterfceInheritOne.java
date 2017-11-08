package nov08;

interface iprint {
	void printing();
}

interface ishow extends iprint {
	void showing();
}

public class InterfceInheritOne implements ishow {

	public void printing() {
		System.out.println("printing");
	}

	public void showing() {
		System.out.println("Showing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfceInheritOne iho = new InterfceInheritOne();
		iho.printing();
		iho.showing();
	}

}
