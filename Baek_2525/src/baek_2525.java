import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baek_2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        int time = Integer.parseInt(br.readLine());

        br.close();

/*
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        int time = sc.nextInt();
*/

        m += time;

        h += m / 60;
        m = m % 60;

        if(h >23)
            h -= 24;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d %d", h, m));
        bw.close();
//        System.out.println(h + " " + m);
    }

}
