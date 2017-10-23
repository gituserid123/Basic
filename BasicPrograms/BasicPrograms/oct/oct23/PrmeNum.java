package oct23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrmeNum {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int n = Integer.parseInt(br.readLine());

		boolean isprime = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isprime = false;
				break;
			}

		}
		if (isprime)
			System.out.println("prime number");
		else
			System.out.println("not a prime number");
	}

}
