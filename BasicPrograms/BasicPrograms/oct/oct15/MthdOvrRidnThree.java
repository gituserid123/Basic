package oct15;

class car{
	
	void maruthi(){
		System.out.println("Max Speed of 800 is 100kmph");
	}
}

public class MthdOvrRidnThree extends car {

	void maruthi(){
		System.out.println("Max Speed of Ciaz is 140kmph");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MthdOvrRidnThree mr = new MthdOvrRidnThree();
		mr.maruthi();

	}

}
