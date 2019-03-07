import java.util.Scanner;

public class baek_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int min1 = 0;
        int min2 = 0;

        if(x<w-x)
            min1 = x;
        else
            min1 = w-x;

        if(y<h-y)
            min2 = y;
        else
            min2 = h-y;

        if(min1<min2)
            System.out.print(min1);
        else
            System.out.print(min2);
    }
}
