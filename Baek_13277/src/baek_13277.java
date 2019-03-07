import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class baek_13277 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        br.close();

        BigInteger a = new BigInteger(tokenizer.nextToken());
        BigInteger b = new BigInteger(tokenizer.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(a.multiply(b)));
        bw.close();

    }
}
