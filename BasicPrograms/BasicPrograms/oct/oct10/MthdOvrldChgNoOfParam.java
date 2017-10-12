package oct10;


class add{
	static int addtn(int a, int b){
		return a+b;
	}
	static int addtn(int a, int b, int c){
		return a+b+c;
	}
}
public class MthdOvrldChgNoOfParam {

	public static void main(String[] args){
		System.out.println(add.addtn(1, 3));
		System.out.println(add.addtn(1, 2, 4));
		
	}
}
