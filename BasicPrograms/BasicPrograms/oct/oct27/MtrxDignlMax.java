package oct27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MtrxDignlMax {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter # of rows");
		int r = Integer.parseInt(br.readLine());
		System.out.println("# of columns");
		int c = Integer.parseInt(br.readLine());

		int[][] arr = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println("enter matrix elements");
				arr[i][j] = Integer.parseInt(br.readLine());

			}

		}
		for (int i = 0; i < r; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][i] < arr[j][j]) {
					int temp = arr[i][i];
					arr[i][i] = arr[j][j];
					arr[j][j] = temp;
				}

			}

		}
		System.out.println("max in dignl: " + arr[0][0]);

	}

}
