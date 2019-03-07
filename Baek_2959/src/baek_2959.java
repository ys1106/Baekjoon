import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_2959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int[] n = new int[4];
        for(int i=0; i<4; i++)
            n[i] = Integer.parseInt(tokenizer.nextToken());

        br.close();

        Arrays.sort(n);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(n[0]*n[2]));
        bw.close();
    }
}
