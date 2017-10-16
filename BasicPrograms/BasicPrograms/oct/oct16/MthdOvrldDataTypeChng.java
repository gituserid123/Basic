package oct16;

class classy{
	
	static int addy(int a, int b){
		return a+b;
	}
	
	static double addy(double a, double b){
		return a+b;
	}
}

public class MthdOvrldDataTypeChng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(classy.addy(2, 8));
		System.out.println(classy.addy(2.1, 2.1));
	}

}
