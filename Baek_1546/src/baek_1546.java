import java.util.Scanner;
public class baek_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] score = new double[N];
        double max = 0;
        int index = 0;
        double sum = 0;

        for(int i=0; i<N; i++)
            score[i] = sc.nextDouble();

        for(int i=0; i<N; i++){
            if(score[i] > max) {
                max = score[i];
            }
        }

        for(int j=0; j<N; j++){
            sum += score[j] / max * 100;
        }

        double average = sum/N;
        System.out.println(Math.round(average*100)/100.0);
    }
}
