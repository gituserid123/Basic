package oct12;

class typepromethree {
	void add(int a, int b) {
		System.out.println("first add method executed");
	}
	void add(float a, float b, int c){
		System.out.println("2nd add"); 
		
	}
}

public class MthdOvrldTypeProme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typepromethree tpr = new typepromethree();
		tpr.add(1, 0);
		tpr.add(2.3f, 4.2f, 3);
	}

}
