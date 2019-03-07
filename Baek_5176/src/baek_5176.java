import java.io.*;
import java.util.StringTokenizer;

public class baek_5176 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<k; i++){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());
            int count = 0;
            boolean[] seat = new boolean[m];
            for(int j=0; j<p; j++)
                seat[Integer.parseInt(br.readLine())-1] = true;

            for(int j=0; j<m; j++) {
                if (seat[j] == true)
                    count++;

            }

            bw.write(String.valueOf(p-count));
            bw.newLine();
        }
        br.close();
        bw.close();

    }
}
