package oct16;

class addtn{
	void addyy(int a, int b){
		System.out.println("Integers are used");
	}

	void addy(float a, float b){
		System.out.println("Float values used");
	}
}


public class MthdOvrLdTypeProm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addtn ad = new addtn();
		//addin ai = new addin();
		
		ad.addy(1.2f, 2.3f);
		ad.addy(2.3f, 3.3f);
		
		
	}

}
