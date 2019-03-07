import java.io.*;
import java.util.StringTokenizer;

public class baek_11024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int sum = 0;

            while(!tokenizer.equals("")){
                sum += Integer.parseInt(tokenizer.nextToken());
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
