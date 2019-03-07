import java.util.Scanner;
public class baek_1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String num = Integer.toString(N);
        long count=0;

        switch(num.length()){
            case 1:
                count = N;
                break;
            case 2:
                count = 9 + (N-9)*2;
                break;
            case 3:
                count = 9+90*2+3*(N-99);
                break;
            case 4:
                count = 9 + 90*2 + 900*3 + (N-999)*4;
                break;
            case 5:
                count = 9 + 90*2 + 900*3 + 9000*4 + (N-9999)*5;
                break;
            case 6:
                count = 9 + 90*2 + 900*3 + 9000*4 + 90000*5 + (N-99999)*6;
                break;
            case 7:
                count = 9 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + (N-999999)*7;
                break;
            case 8:
                count =  9 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + 9000000*7 + (N-9999999)*8;
                break;
            case 9:
                count =  9 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + 9000000*7 + 90000000*8 + (N-99999999)*9;
                break;
        }

        System.out.println(count);

       /* for(int i=1; i<=N; i++)
            num += Integer.toString(i);

        System.out.println(num.length());*/
    }
}
