import java.io.*;

public class baek_9243 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] prev = br.readLine().split("");
        String[] now = br.readLine().split("");
        int[] num1 = new int[prev.length];
        int[] num2 = new int[now.length];
        br.close();
        String print = "Deletion succeeded";
        for(int i=0; i<prev.length; i++){
            num1[i] = Integer.parseInt(prev[i]);
            num2[i] = Integer.parseInt(now[i]);
        }



        if(n%2==0){
            for(int i=0; i<prev.length; i++){
                if(num1[i] != num2[i]){
                    print = "Deletion failed";
                    break;
                }
            }
        }
        else{
            for(int i=0; i<prev.length; i++){
                if(num1[i] == num2[i]){
                    print = "Deletion failed";
                    break;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(print);
        bw.close();


    }
}
