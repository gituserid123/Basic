package nov08;

interface one {
	int add();
}

public class InterfaceOne implements one {
	public int add() {
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceOne io = new InterfaceOne();
		System.out.println(io.add());
	}

}
