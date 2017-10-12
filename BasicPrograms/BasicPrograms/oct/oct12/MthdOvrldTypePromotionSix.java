package oct12;

class typeprom {
	void add(int a, int b) {
		System.out.println(a + b);

	}
	void add( float a, int b, double c){
		System.out.println(c+a-b);
	}
}

public class MthdOvrldTypePromotionSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typeprom tp = new typeprom();
		tp.add(1, 3);
		tp.add(3.2f, 1, 6.33);
	}

}
