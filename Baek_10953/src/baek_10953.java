import java.io.*;

public class baek_10953 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String num = br.readLine();
            String[] nums = num.split(",");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            bw.write(String.format("%d", a+b));
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}
