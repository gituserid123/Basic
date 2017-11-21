package nov09;

interface RBI {
	float ROI();
}

class Xbank implements RBI {
	public float ROI() {
		return 6.3f;
	}

}

class Ybank implements RBI {
	public float ROI() {
		return 7.53f;
	}
}

public class IntfceBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xbank x = new Xbank();
		Ybank y = new Ybank();
		System.out.println(x.ROI());
		System.out.println(y.ROI());
	}

}
