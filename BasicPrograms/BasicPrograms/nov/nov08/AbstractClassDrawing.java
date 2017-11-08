package nov08;

abstract class drwing {
	abstract void shape();
}

class circle extends drwing {
	void shape() {
		System.out.println("drawing circle");
	}
}

class line extends drwing {
	void shape() {
		System.out.println("drawing line");
	}
}

public class AbstractClassDrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle cr = new circle();
		line li = new line();
		cr.shape();
		li.shape();
	}

}
