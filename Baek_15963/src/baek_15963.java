import java.io.*;
import java.util.StringTokenizer;

public class baek_15963 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        String n = tokenizer.nextToken();
        String m = tokenizer.nextToken();
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(n.equals(m))
            bw.write(String.valueOf(1));
        else
            bw.write(String.valueOf(0));

        bw.close();
    }
}
