import java.io.*;
import java.util.StringTokenizer;

public class baek_1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] house = new int[N][3];
        for (int i = 0; i < N; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            house[i][0] = Integer.parseInt(tokenizer.nextToken());
            house[i][1] = Integer.parseInt(tokenizer.nextToken());
            house[i][2] = Integer.parseInt(tokenizer.nextToken());
        }
        br.close();

        int min = 0;
        int min2 = 0;

        for(int i=1; i<N; i++){
            if(house[i-1][1]<house[i-1][2])
                min = house[i-1][1];
            else
                min = house[i-1][2];
            house[i][0] = min + house[i][0];

            if(house[i-1][0]<house[i-1][2])
                min = house[i-1][0];
            else
                min = house[i-1][2];
            house[i][1] = min + house[i][1];

            if(house[i-1][0]<house[i-1][1])
                min = house[i-1][0];
            else
                min = house[i-1][1];
            house[i][2] = min + house[i][2];
        }

        if(house[N-1][0] < house[N-1][1])
            min2 = house[N-1][0];
        else
            min2 = house[N-1][1];
        if(house[N-1][2] < min2)
            min2 = house[N-1][2];

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d", min2));
        bw.newLine();
        bw.close();
    }
}
