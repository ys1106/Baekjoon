import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_10817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        br.close();

        int[] num = new int[3];
        for(int i=0; i<3; i++)
            num[i] = Integer.parseInt(tokenizer.nextToken());

        Arrays.sort(num);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(num[1]));
        bw.close();
    }
}
