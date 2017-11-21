package nov09;

abstract class drw{
	abstract void shapes();
}

class rectngle extends drw{
	void shapes(){
		System.out.println("drawing rectangle");
	}
}

class triangle extends drw{
	void shapes(){
		System.out.println("drawing hexagon");
	}
}
public class AbstrtClssDrw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectngle rc = new rectngle();
		triangle tr = new triangle();
		
		rc.shapes();
		tr.shapes();
	}

}
