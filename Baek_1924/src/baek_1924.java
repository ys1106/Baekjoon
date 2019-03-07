import java.io.*;
import java.util.StringTokenizer;

public class baek_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(tokenizer.nextToken());
        int y = Integer.parseInt(tokenizer.nextToken());

        br.close();

        String week = "";
        int n = 0;

        switch(x){
            case 1:
            case 10:
                n=0;
                break;
            case 2:
            case 3:
            case 11:
                n=4;
                break;
            case 4:
            case 7:
                n=1;
                break;
            case 5:
                n=6;
                break;
            case 6:
                n=3;
                break;
            case 8:
                n=5;
                break;
            case 9:
            case 12:
                n=2;
                break;
        }
        if(y%7==n)
            week = "SUN";
        else if(y%7==(n+1)%7)
            week = "MON";
        else if(y%7==(n+2)%7)
            week = "TUE";
        else if(y%7==(n+3)%7)
            week = "WED";
        else if(y%7==(n+4)%7)
            week = "THU";
        else if(y%7==(n+5)%7)
            week = "FRI";
        else if(y%7==(n+6)%7)
            week = "SAT";

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(week);
        bw.close();
        }
    }

