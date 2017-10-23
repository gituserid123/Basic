package oct23;


class addin{
	static int adde(int a, int b){
		return a+b;
	}
	
	static int adde(int a, int b, int c){
		return a+b+c;
	}
}


public class MthdOvrldChngNoOfParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(addin.adde(1, 2));
		System.out.println(addin.adde(1, 2, 3));
	}

}
