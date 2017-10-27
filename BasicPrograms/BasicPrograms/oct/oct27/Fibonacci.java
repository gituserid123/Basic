package oct27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int n = Integer.parseInt(br.readLine());

		int n1 = 0, n2 = 1, n3;
		System.out.print(" The fib are: " + n1 + " " + n2 + " ");

		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;

		}
	}

}
