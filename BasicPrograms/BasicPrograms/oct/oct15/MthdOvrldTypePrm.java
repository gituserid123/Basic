package oct15;

class typepromn {
	void add(int a, int b) {
		System.out.println("Integer");

	}

	void add(double a, double b) {
		System.out.println("decimals");
	}
}

public class MthdOvrldTypePrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typepromn tpm = new typepromn();
		tpm.add(1, 2);
		tpm.add(3.3, 3.3);

	}

}
