package oct27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MtrxMaxCol {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter # of rows");
		int r = Integer.parseInt(br.readLine());
		System.out.println("enter # ov cols");
		int c = Integer.parseInt(br.readLine());

		int[][] arr = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println("etner matrix elemnts");
				arr[i][j] = Integer.parseInt(br.readLine());

			}

		}

		for (int i = 0; i < r - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				for (int k = 0; k < arr[i].length; k++) {
					if (arr[j][k] < arr[j + 1][k]) {
						int temp = arr[j][k];
						arr[j][k] = arr[j + 1][k];
						arr[j + 1][k] = temp;

					}

				}
			}

		}
		System.out.println("max in col is ");

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println(arr[j][i]);
				break;

			}

		}
	}

}
