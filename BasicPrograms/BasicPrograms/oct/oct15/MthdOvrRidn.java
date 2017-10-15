package oct15;

class vehicle {
	void run() {
		System.out.println("vehicle is running");
	}
}

class MthdOvrRidn extends vehicle {
	void run() {
		System.out.println("vehicle is running sfely");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MthdOvrRidn mtr = new MthdOvrRidn();
		mtr.run();
		
	}
}
