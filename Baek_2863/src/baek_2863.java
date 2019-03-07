import java.io.*;
import java.util.StringTokenizer;

public class baek_2863 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(tokenizer1.nextToken());
		int B = Integer.parseInt(tokenizer1.nextToken());

		StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(tokenizer2.nextToken());
		int D = Integer.parseInt(tokenizer2.nextToken());

		br.close();
		
		int[] num = new int[4];

		num[0] = A / C + B / D;
		num[1] = C / D + A / B;
		num[2] = D / B + C / A;
		num[3] = B / A + D / C;

		int max = 0;
		int index = -1;
		for (int i = 0; i < 4; i++) {
			if (num[i] > max) {
				max = num[i];
				index = i;
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.format("%d", index));
		
		bw.close();
	}

}
