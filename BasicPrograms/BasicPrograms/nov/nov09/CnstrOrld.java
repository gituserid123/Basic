package nov09;

public class CnstrOrld {

	int id, age;
	String name;

	CnstrOrld(int i, String n) {
		id = i;
		name = n;
	}

	CnstrOrld(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CnstrOrld co1 = new CnstrOrld(12, "Twelve");
		CnstrOrld co2 = new CnstrOrld(13, "Thirteen", 30);

		co1.display();
		co2.display();
	}

}
