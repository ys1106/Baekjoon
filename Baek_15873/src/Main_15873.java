import java.util.Scanner;

public class Main_15873 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String AB = sc.next();
		
		int A;
		int B;
		if(AB.charAt(1)=='0') {
			A = Integer.parseInt(AB.substring(0,2));
			B = Integer.parseInt(AB.substring(2,AB.length()));
		
		}
		else {
			A = Integer.parseInt(AB.substring(0,1));
			B = Integer.parseInt(AB.substring(1,AB.length()));
		}
		
		System.out.println(A+B);
		
		

	}

}
