package oct23;


class Bike{
	void speed(){
		System.out.println("Bike is running");
	}
}

class Splendor extends Bike{
	void speed(){
		System.out.println("Bike is running at 60 kmph");
	}
}

public class MthdOvrRdBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Splendor s = new Splendor();
		s.speed();

	}

}
