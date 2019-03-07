import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class baek_2407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        BigInteger n = new BigInteger(tokenizer.nextToken());
        BigInteger m = new BigInteger(tokenizer.nextToken());
        br.close();

        if(m.compareTo(n.divide(BigInteger.valueOf(2)))==1)
            m = n.subtract(m);

        BigInteger up = BigInteger.ONE;
        BigInteger down = BigInteger.ONE;

        for(BigInteger i = BigInteger.valueOf(1); i.compareTo(m)!=1; i=i.add(BigInteger.ONE)) {
            up = up.multiply(n);
            n=n.subtract(BigInteger.ONE);
            down = down.multiply(i);
        }

       //Long result = Double.valueOf(up/(double)down).longValue();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(up.divide(down)));
        bw.close();
    }
}
