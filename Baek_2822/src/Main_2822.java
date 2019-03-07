import java.util.Scanner;

public class Main_2822 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] score = new int[8];
		int[] index = new int[5];
		int sum = 0;
		int count = 0;
		int max = Integer.MIN_VALUE;
		int j = 0;

		for (int i = 0; i < 8; i++)
			score[i] = sc.nextInt();

		while (count != 5) {
			for (int i = 0; i < 8; i++) {
				if (score[i] > max) {
					max = score[i];
					j = i;
				}

			}
			count++;
			sum += max;
			int k = 0;
			index[k] = j;
			k++;

			for (int i = 0; i < 8; i++) {
				if (score[i] == max)
					score[i] = -1;

			}
		}

		System.out.println(sum);

		for (int i = 0; i < 5; i++)
			System.out.print(index[i] + " ");

	}
}
/*
 * Scanner sc = new Scanner(System.in); int[] score = new int[8]; int sum = 0;
 * int count = 0; int max = Integer.MAX_VALUE; int[] result = new int[5]; int j;
 * 
 * for (int i = 0; i < 8; i++) score[i] = sc.nextInt();
 * 
 * while (count == 5) { for (int i = 0; i < 8; i++) { if (score[i] > max) { max
 * = score[i]; j = i; } }
 * 
 * sum += score[j]; count++; result[count] = score[j];
 * 
 * }
 * 
 * }
 */
