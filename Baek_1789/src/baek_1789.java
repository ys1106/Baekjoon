import java.io.*;

public class baek_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        br.close();

        int i=1;
        int num =0;
        int count=0;

        while(num<S){
            num += i;
            i++;
            count++;
        }
        //if(num!=S)






        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.close();
    }
}
