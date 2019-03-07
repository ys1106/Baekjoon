import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        br.close();
        int[] num = new int[N];
        for(int i=0; i<N; i++)
            num[i] = Integer.parseInt(tokenizer.nextToken());

        Arrays.sort(num);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(num[0]));
        bw.write(" ");
        bw.write(String.valueOf(num[N-1]));
        bw.close();
    }
}
