import java.io.*;
import java.util.StringTokenizer;

public class baek_8949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        String a = tokenizer.nextToken();
        String b = tokenizer.nextToken();
        br.close();
        int[] A;
        int[] B;

        int length = 0;

        if (a.length() > b.length()) {
            length = a.length();
            A = new int[length];
            B = new int[length];
        } else {
            length = b.length();
            A = new int[length];
            B = new int[length];
        }

        String[] a1 = a.split("");
        String[] b1 = b.split("");


        int j = 0;

        for (int i = a1.length - 1; i >= 0; i--){
            A[j] = Integer.parseInt(a1[i]);
            j++;
        }
        j=0;
        for(int i=b1.length-1; i>=0; i--){
            B[j] = Integer.parseInt(b1[i]);
            j++;
        }

        String sum = "";

        for(int i=length-1; i>=0; i--){
            sum += Integer.toString(A[i]+B[i]);

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sum);
        bw.close();
    }
}
