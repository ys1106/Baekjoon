import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baek_2847 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		int count = 0;

		for (int i = 0; i < N; i++)
			num[i] = Integer.parseInt(br.readLine());

		br.close();

		for (int i = N-1; i > 0; i--) {
			while (num[i - 1] >= num[i]) {
				num[i - 1] -= 1;
				count++;
			}
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.format("%d", count));
		bw.close();
	}

}
