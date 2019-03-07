import java.io.*;
import java.util.StringTokenizer;

public class baek_5656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = 0;
        String s = "";
        int num2 = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = 0;
        while(!s.equals("E")) {
            i++;
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            num1 = Integer.parseInt(tokenizer.nextToken());
            s = tokenizer.nextToken();
            num2 = Integer.parseInt(tokenizer.nextToken());

            if(s.equals("E"))
                break;

            boolean check = false;

             switch(s){
                 case ">":
                     if(num1 > num2)
                        check = true;
                     break;
                 case ">=":
                     if(num1 >= num2)
                         check = true;
                     break;
                 case "<":
                     if(num1 < num2)
                         check = true;
                     break;
                 case "<=":
                     if(num1 <= num2)
                         check = true;
                     break;
                 case "==":
                     if(num1 == num2)
                         check = true;
                     break;
                 case "!=":
                     if(num1 != num2)
                         check = true;
                     break;
             }
             bw.write("Case ");
             bw.write(String.valueOf(i));
             bw.write(": ");
             bw.write(String.valueOf(check));
             bw.newLine();
        }
        bw.close();
    }
}
