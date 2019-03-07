import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer1.nextToken());
        int m = Integer.parseInt(tokenizer1.nextToken());
        int[] A = new int[n];
        int sum = 0;

        StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++)
            A[i] = Integer.parseInt(tokenizer2.nextToken());

        while(sum<m){
            for(int i=0; i<n; i++)
                sum += A[i];
        }


    }
}
