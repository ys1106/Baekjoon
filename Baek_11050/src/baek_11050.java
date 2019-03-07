import java.io.*;
import java.util.StringTokenizer;

public class baek_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        br.close();

        int up = 1;
        int down = 1;

        for(int i=1; i<=k; i++){
            up *= n;
            n--;
            down *= i;
        }

        double result = up/(double)down;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf((int)result));
        bw.close();
    }
}
