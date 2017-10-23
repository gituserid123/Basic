package oct23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LpYrTwo {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a yer");
		int n = Integer.parseInt(br.readLine());
		
		if((n%100==0)&&(n%400==0))
			System.out.println("leap yr");
		else if((n%100!=0)&&(n%4==0))
			System.out.println("leap yr");
		else
			System.out.println("not a lp yr");
	}

}
