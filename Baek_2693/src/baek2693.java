import java.util.Scanner;

public class baek2693 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        for(int i=0; i<T; i++) {
            int max1 = 0;
            int max2 = 0;
            int max3 = 0;
            int[] A = new int[10];

            for(int j=0; j<10;j++) {
                A[j] = sc.nextInt();
            }
            for(int k=0; k<10; k++){
                if(A[k] > max1)
                    max1 = A[k];
            }

            for(int k=0; k<10; k++){
                if(A[k]>max2 && A[k]<max1)
                    max2 = A[k];
            }
            for(int k=0; k<10; k++){
                if(A[k]>max3 && A[k]<max2)
                    max3 = A[k];
            }

            System.out.println(max3);
        }





    }


}
