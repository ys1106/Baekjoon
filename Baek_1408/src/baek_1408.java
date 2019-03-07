import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_1408 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String now = br.readLine();
        String start = br.readLine();

        String[] nows = now.split(":");
        String[] starts = now.split(":");

        int[] Nows = new int[3];
        int[] Starts = new int[3];
        int[] time = new int[3];

        for(int i=0; i<3; i++){
            Nows[i] = Integer.parseInt(nows[i]);
            Starts[i] = Integer.parseInt(starts[i]);
        }

        if(Nows[0]<Starts[0]){
            if(Starts[2]<Nows[2]){
                if(Starts[1]==0) {
                    Starts[1] = 60;
                    Starts[0]--;
                }
                time[2] = 60+Starts[2]-Nows[2];
                Starts[1]--;
            }
            else{
                time[2] = Starts[2] - Nows[2];
            }
            if(Starts[1]<Nows[1]){
                
            }
        }


    }

}
