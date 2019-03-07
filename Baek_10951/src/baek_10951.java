import java.io.*;
import java.util.StringTokenizer;

public class baek_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            String aa = tokenizer.nextToken();
            if(aa.equals(""))
                break;
            int a = Integer.parseInt(aa);
            int b = Integer.parseInt(tokenizer.nextToken());
            bw.write(String.valueOf(a+b));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
