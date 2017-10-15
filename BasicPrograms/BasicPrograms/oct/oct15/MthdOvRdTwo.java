package oct15;

class home{
	
	void type(){
		System.out.println("condo");
	}
}

public class MthdOvRdTwo extends home {
	
	void type(){
		System.out.println("Efficency");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MthdOvRdTwo mdt = new MthdOvRdTwo();
		mdt.type();

	}

}
