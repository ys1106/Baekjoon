import java.io.*;

public class baek_10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = 0;
        int sum = 0;


        for(int i=0; i<5; i++) {
            score = Integer.parseInt(br.readLine());
            if(score>=40)
                sum+=score;
            else
                sum+=40;
        }

        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum/5));
        bw.close();
    }
}
