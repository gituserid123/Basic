package oct27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int n = Integer.parseInt(br.readLine());
		if (n % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

}
