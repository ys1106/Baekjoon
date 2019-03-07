import java.io.*;
import java.util.StringTokenizer;

public class baek_4153 {

    static int[] sort(int[] array){
        int maxIndex = -1;
        int minIndex = -1;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] array2 = new int[3];
        if(array[0]>max) {
            max = array[0];
            maxIndex = 0;
        }
        if(array[1]>max) {
            max = array[1];
            maxIndex = 1;
        }
        if(array[2]>max) {
            max = array[2];
            maxIndex = 2;
        }

        for(int i=0; i<3; i++){
            if(i != maxIndex){
                if(array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }
            }
        }

        for(int i=0; i<3; i++){
            if(i != maxIndex && i != minIndex)
                array2[1] = array[i];
        }
        array2[0] = array[minIndex];
        array2[2] = array[maxIndex];

        return array2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int[] num = new int[3];
            num[0] = Integer.parseInt(tokenizer.nextToken());
            num[1] = Integer.parseInt(tokenizer.nextToken());
            num[2] = Integer.parseInt(tokenizer.nextToken());
            String string = Integer.toString(num[0]) + Integer.toString(num[1]) + Integer.toString(num[2]);
            if(string.equals("000"))
                break;
            int[] sort_num = sort(num);
            if(Math.pow(sort_num[0],2)+Math.pow(sort_num[1],2)==Math.pow(sort_num[2],2))
                bw.write("right");
            else
                bw.write("wrong");
            bw.newLine();
        }
        br.close();
        bw.close();

    }
}
