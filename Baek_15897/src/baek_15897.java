import java.util.Scanner;

public class baek_15897 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for(int i=1; i<n; i++){
            count += n/i;
            if(n%i != 0)
                count++;
        }

        System.out.print(count);
    }
}
