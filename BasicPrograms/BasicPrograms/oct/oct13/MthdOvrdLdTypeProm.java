package oct13;

class typeprm {
	void addin(int a, int b) {
		System.out.println("Integers");

	}
	void addin(float a, float b){
		System.out.println("decimals");
	}
}

public class MthdOvrdLdTypeProm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typeprm tpr = new typeprm();
		tpr.addin(1.2f, 3.5f);
		tpr.addin(1, 2);

	}

}
