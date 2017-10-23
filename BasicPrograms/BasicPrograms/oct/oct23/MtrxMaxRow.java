package oct23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MtrxMaxRow {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of rows");
		int r = Integer.parseInt(br.readLine());
		System.out.println("enter nof columns");
		int c = Integer.parseInt(br.readLine());

		int[][] arr = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println("enter matrix elements");
				arr[i][j] = Integer.parseInt(br.readLine());

			}

		}

		int temp;
		boolean flag = false;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				for (int k = 0; k < arr[i].length - 1; k++) {
					if (arr[i][k] < arr[i][k + 1]) {
						temp = arr[i][k];
						arr[i][k] = arr[i][k + 1];
						arr[i][k + 1] = temp;
					}

				}

			}

		}
		System.out.println("the maximum numbers are: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println(arr[i][0]);
				break;

			}

		}

	}

}
