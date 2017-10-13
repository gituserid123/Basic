package oct13;

class typeprom{
	
	void add(int a, int b){
		System.out.println("Its addition of integers");
	}
	
	void add(double a, double b){
		System.out.println("its addition of decimals");
	}
}

public class MthdOvrdTypeProm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typeprom tp = new typeprom();
		tp.add(1.5, 2.5);
		tp.add(1, 6);

	}

}
