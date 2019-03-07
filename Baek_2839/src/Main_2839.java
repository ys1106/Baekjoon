import java.util.Scanner;

public class Main_2839 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = 0;

		switch (N % 5) {
		case 0:
			n = N / 5;
			break;
		case 3:
			n = N / 5;
			n += 1;
			break;
		case 1:
			if (N == 1)
				n = -1;
			else
				n = 2 + (N - 6) / 5;
			break;
		case 2:
			if (N == 2 || N == 7)
				n = -1;
			else
				n = 4 + (N - 12) / 5;
			break;
		case 4:
			if (N == 4)
				n = -1;
			else
				n = 3 + (N - 9) / 5;
			break;
		}
		System.out.println(n);

	}

}
