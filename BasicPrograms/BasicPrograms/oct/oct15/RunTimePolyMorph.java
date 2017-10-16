package oct15;

class Bike{
	
	void run(){
		System.out.println("Running");
	}
}

class Splendor extends Bike{
	
	void run(){
		System.out.println("Bike Running at 60");
	}
}

public class RunTimePolyMorph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b = new Splendor();
		b.run();

	}

}
