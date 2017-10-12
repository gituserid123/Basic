package oct10;

class addoverld{
	static int addo(int a , int b){
		return a+b;
	}
	
	static float addo(float a, float b){
		return a+b;
	}
}

public class MthdOvrldChngDataTypeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addoverld.addo(3, 4));
		System.out.println(addoverld.addo(3.5f, 4.5f));
	}

}
