import java.util.Scanner;

public class baek_2153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int length = word.length();
        int[] words = new int[length];
        for(int i=0; i<length; i++)
            words[i] = word.charAt(i);
        int k=0;
        int[] num = new int[length];
        int sum = 0;
        int count = 0;

        for(int i=0; i<length; i++){
            if(Character.isUpperCase(words[i])==false){
                k=0;
                for(int j=97; j<=122; j++) {
                    k++;
                    if (words[i] == j) {
                        num[i] = k;
                        break;
                }
            }
            }
            else {
                k=26;
                for (int j = 65; j <= 90; j++) {
                    k++;
                    if (words[i] == j) {
                        num[i] = k;
                        break;
                    }
                }
            }
            sum += num[i];
        }

        if(sum != 1) {
            for (int i = 2; i < sum; i++) {
                if (sum % i == 0) {
                    count++;
                    break;
                }
            }
        }
        if(sum == 1 || count == 0)
            System.out.println("It is a prime word.");
        else
            System.out.println("It is not a prime word.");

    }
}
