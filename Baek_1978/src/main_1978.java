import java.util.Scanner;

public class main_1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		int[] num = new int[N];
		for (int i = 0; i < N; i++)
			num[i] = sc.nextInt();

		int count2 = 0;

		for (int i = 0; i < N; i++) {
	
			if (num[i] != 1) {
				int count1=0;
				for (int j = 2; j < num[i]; j++) {
					if (num[i] % j == 0) {
						count1++;
						break;
					}
					
				}
				if (count1 == 0)
					count2++;
			}
		}
		System.out.println(count2);
	}

}
