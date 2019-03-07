import java.io.*;
import java.util.StringTokenizer;

public class baek_2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        br.close();
        int[] num = new int[5];
        String result = "";
        for(int i=0; i<5; i++) {
            num[i] = Integer.parseInt(tokenizer.nextToken());
            result += String.valueOf(num[i]);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        while(!result.equals("12345")) {
            result = "";
            for (int i = 1; i < 5; i++) {
                if (num[i - 1] > num[i]) {
                    int n = num[i - 1];
                    num[i - 1] = num[i];
                    num[i] = n;
                    for (int j = 0; j < 5; j++) {
                        bw.write(String.valueOf(num[j]));
                        bw.write(" ");
                    }
                    bw.newLine();
                }
            }
            for (int i = 0; i < 5; i++)
                result += String.valueOf(num[i]);
        }
        bw.close();
    }
}
