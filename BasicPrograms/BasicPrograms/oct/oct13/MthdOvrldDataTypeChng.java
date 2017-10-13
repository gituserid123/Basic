package oct13;

class addi {
	static int add(int a, int b) {
		return a + b;

	}
	static double add(double a, double b){
		return a+b;
	}
}

public class MthdOvrldDataTypeChng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addi.add(1, 3));
		System.out.println(addi.add(1.0, 2.0));

	}

}
