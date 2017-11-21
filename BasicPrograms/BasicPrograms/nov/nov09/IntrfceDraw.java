package nov09;

interface shape {
	void draw();
}

class line implements shape {
	public void draw() {
		System.out.println("drawing a straight line");
	}
}

class octagon implements shape {
	public void draw() {
		System.out.println("drawing an octogan");
	}
}

public class IntrfceDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		line li = new line();
		octagon oc = new octagon();

		li.draw();
		oc.draw();
	}

}
