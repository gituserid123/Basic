package oct12;

class typeprome {
	void add(int a, int b) {
		System.out.println("first add method executed");

	}
	
	void add(int a, float b, double c){
		System.out.println("second add method executed");
	}
}

public class MthdOvrdTypePrm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typeprome tpe = new typeprome();
		tpe.add(10, 10);
		tpe.add(1, 2.3f, 6.33);
	}

}
