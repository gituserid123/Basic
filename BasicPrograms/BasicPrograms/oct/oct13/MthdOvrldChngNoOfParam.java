package oct13;

class addtn{
	static int add( int a , int b){
		return a+b;
	}
	static int add(int a , int b, int c){
		return a+b+c;
	}
}

public class MthdOvrldChngNoOfParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addtn.add(1, 2));
		System.out.println(addtn.add(1, 2, 3));

	}

}
