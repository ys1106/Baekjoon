import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_1850 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tokenizer = new StringTokenizer(br.readLine());
		br.close();

		Long N = Long.parseLong(tokenizer.nextToken()) - Long.parseLong(tokenizer.nextToken());
		
		for(int i=0; i<Math.abs(N); i++)
			System.out.print(1);
	}

}
