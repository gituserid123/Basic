package oct27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BbbleSrt {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter how many elments");
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("enter numbers");
			arr[i] = Integer.parseInt(br.readLine());

		}

		int limit = n - 1, temp;
		boolean flag = false;

		for (int i = 0; i < limit; i++) {
			for (int j = 0; j < limit; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}

			}
			if (flag == false)
				break;
			else
				flag = false;

		}
		System.out.println("sorted numbers: ");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");

		}
	}

}
