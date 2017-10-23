package oct23;

class addy{
	
	static int add(int a, int b){
		return a+b;
	}
	
	static double add(double a, double b){
		return a+b;
	}
}

public class MthdOvrldDtaTypChng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addy.add(1, 2));
		System.out.println(addy.add(2.3, 3.3));

	}

}
