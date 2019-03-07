import java.io.*;

public class baek_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();
        br.close();

        String[] nums = num.split("");
        int sum = 0;

        for(int i=0; i<N; i++)
            sum += Integer.parseInt(nums[i]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d",sum));
        bw.close();
    }

}
