package oct27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrme {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int n = Integer.parseInt(br.readLine());
		int r, sum = 0, temp;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}
		if (temp == sum)
			System.out.println("Palindrome");
		else
			System.out.println("not a palindrome");
	}

}
