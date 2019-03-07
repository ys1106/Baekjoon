import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_2863 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(tokenizer1.nextToken());
        double B = Double.parseDouble(tokenizer1.nextToken());

        StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());
        double C = Double.parseDouble(tokenizer2.nextToken());
        double D = Double.parseDouble(tokenizer2.nextToken());

        br.close();

        double[] num = new double[4];

        num[0] = A / C + B / D;
        num[1] = C / D + A / B;
        num[2] = D / B + C / A;
        num[3] = B / A + D / C;

        double max = Double.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < 4; i++) {
            if (num[i] > max) {
                max = num[i];
                index = i;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(index));
        bw.close();
    }

}
