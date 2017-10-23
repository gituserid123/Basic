package oct23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrmeNumGnrnTwo {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 2; i <= n; i++) {
			boolean isprime=true;
			for (int j = 2; j < i; j++) {
				if(i%j==0){
					isprime=false;
					break;
					
				}
				
			}
			if(isprime)
				System.out.print(i+" ");
		}
	}

}
