package oct12;

class addtn {
	static int adding(int a, int b) {
		return a + b;
	}

	static float adding(float a, float b) {
		return a + b;
	}
}

public class MthdOvrldChngDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addtn.adding(1.5f, 2.3f));
		System.out.println(addtn.adding(9, 7));

	}

}
