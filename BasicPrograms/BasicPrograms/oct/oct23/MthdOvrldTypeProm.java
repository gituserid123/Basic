package oct23;

class addie{
	void add(int a, int b){
		System.out.println("Integers");
	}
	void add(float a, float b){
		System.out.println("float values");
	}
}

public class MthdOvrldTypeProm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addie e = new addie();
		e.add(1.2f, 3.4f);
		e.add(1, 4);
	}

}
