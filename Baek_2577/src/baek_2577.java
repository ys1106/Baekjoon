import java.util.*;

public class baek_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int m = a * b * c;

        int[] count = new int[10];

        String num = Integer.toString(m);
        String[] nums = num.split("");

        for(int i=0; i<nums.length; i++){
            int number = Integer.parseInt(nums[i]);
            for(int j=0; j<10; j++)
                if(number==j) {
                    count[j]++;
                    break;
                }
       }
       for(int i=0; i<10; i++)
           System.out.println(count[i]);
    }
}
