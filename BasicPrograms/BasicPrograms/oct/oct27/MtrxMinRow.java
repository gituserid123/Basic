package oct27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MtrxMinRow {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter rows");
		int r = Integer.parseInt(br.readLine());
		System.out.println("enter # of cols");
		int c = Integer.parseInt(br.readLine());

		int[][] arr = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println("enter matrix elelentns");
				arr[i][j] = Integer.parseInt(br.readLine());

			}

		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				for (int k = 0; k < arr[i].length - 1; k++) {
					if (arr[i][k] > arr[i][k + 1]) {
						int temp = arr[i][k];
						arr[i][k] = arr[i][k + 1];
						arr[i][k + 1] = temp;
					}

				}

			}

		}
		System.out.println("min in rows are:");

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println(arr[i][0]);
				break;

			}

		}
	}

}
