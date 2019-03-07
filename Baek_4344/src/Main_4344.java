import java.util.Scanner;

public class Main_4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int[][] score = new int[C][];

		for (int i = 0; i < C; i++) {
			int N = sc.nextInt();
			score[i] = new int[N];
			for (int j = 0; j < N; j++) {
				score[i][j] = sc.nextInt();
			}
		}

		int[] sum = new int[C];
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum[i] += score[i][j];
			}
		}

		double[] avg = new double[C];

		for (int i = 0; i < C; i++) {
			avg[i] = sum[i] / score[i].length;
			double count = 0;
			for (int j = 0; j < score[i].length; j++) {
				if (score[i][j] > avg[i])
					count++;
			}
			//System.out.println(Math.round(1000 * (100 * count / score[i].length)) / 1000.0 + "%");
			System.out.format("%.3f", 100 * count / score[i].length);
			System.out.println("%");
		}

	}

}
