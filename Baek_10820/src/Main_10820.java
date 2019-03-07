import java.util.Scanner;

public class Main_10820 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] string = new String[100];
        char[] split;
        int i=0;

        while(sc.hasNextLine()) {
            int check1=0,check2=0,check3=0,check4=0;
            string[i] = sc.nextLine();
            split = string[i].toCharArray();
            for(int j=0; j<string[i].length(); j++){
                if(Character.isLowerCase(split[j]))
                    check1++;
                else if(Character.isUpperCase(split[j]))
                    check2++;
                else if(split[j] == ' ')
                    check4++;
                 else
                    check3++;
                }
                i++;

            System.out.println(String.format("%d %d %d %d", check1, check2, check3, check4));

        }

    }
}
