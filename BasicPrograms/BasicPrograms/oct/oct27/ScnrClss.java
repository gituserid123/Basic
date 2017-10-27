package oct27;

import java.util.Scanner;

public class ScnrClss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name, id, sal");
		String name = sc.next();
		int id = sc.nextInt();
		int sal = sc.nextInt();

		System.out.println("name:- " + name);
		System.out.println("id:- " + id);
		System.out.println("sal:- " + sal);
	}

}
