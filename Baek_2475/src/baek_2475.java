import java.io.*;
import java.util.StringTokenizer;

public class baek_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        br.close();
        int result = 0;
        for(int i=0; i<5; i++) {
            int n = Integer.parseInt(tokenizer.nextToken());
            result += n*n;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result%10));
        bw.close();
    }
}
