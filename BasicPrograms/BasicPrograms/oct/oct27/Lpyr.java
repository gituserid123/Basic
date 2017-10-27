package oct27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lpyr {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter an yr");
		int n = Integer.parseInt(br.readLine());

		if ((n % 100 == 0) && (n % 400 == 0))
			System.out.println("lp yr");
		else if ((n % 100 != 0) && (n % 4 == 0))
			System.out.println("lp yr");
		else
			System.out.println("Not a lp yr");
	}

}
