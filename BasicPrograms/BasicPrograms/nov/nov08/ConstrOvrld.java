package nov08;

public class ConstrOvrld {

	int id;
	String name;
	int age;

	ConstrOvrld(int i, String n) {
		id = i;
		name = n;
	}

	ConstrOvrld(int i, String n, int a) {
		id = i;
		name = n;
		age = a;

	}

	void display() {
		System.out.println("name:-" + name + "id:- " + id + " age:-" + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstrOvrld co = new ConstrOvrld(11, "Eleven");
		ConstrOvrld co2 = new ConstrOvrld(12, "Twelve", 30);
		ConstrOvrld c3 = new ConstrOvrld(13, "Thirteen");

		co.display();
		co2.display();
		c3.display();
	}

}
