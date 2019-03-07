import java.io.*;
import java.util.StringTokenizer;

public class baek_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<T; i++){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            bw.write(String.valueOf(a+b));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
