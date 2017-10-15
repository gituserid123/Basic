package oct15;

class Humanstwo{
	void run(){
		System.out.println("walk");
	}
}

public class MthdOvrRidnTwo extends Humanstwo {
	void run(){
		System.out.println("run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MthdOvrRidnTwo mto= new MthdOvrRidnTwo();
		mto.run();

	}

}
