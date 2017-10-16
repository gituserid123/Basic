package oct16;

class additin{
	
	static int add(int a, int b){
		return a+b;
	}
	
	static int add(int a, int b , int c){
		return a+b-c;
	}
}



public class MthdOvrLdChngNoOfParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(additin.add(1, 2));
		System.out.println(additin.add(1, 2, 3));
		
	}

}
