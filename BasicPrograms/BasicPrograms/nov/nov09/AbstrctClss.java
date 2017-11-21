package nov09;

abstract class shap {
	abstract void drawing();
}

class circle extends shap {
	void drawing() {
		System.out.println("Circle is drawn"); 
	}
}

public class AbstrctClss extends circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstrctClss ac = new AbstrctClss();
		ac.drawing();
	}

}
