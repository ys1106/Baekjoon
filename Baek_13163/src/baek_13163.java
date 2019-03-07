import java.io.*;

public class baek_13163 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nicknames = new String[N];
        int length = 0;
        for(int i=0; i<N; i++) {
            nicknames[i] = br.readLine();
            String[] nick = nicknames[i].split(" ");
            length = nick.length;
            bw.write("god");
            for(int j=1; j<length; j++) {
                bw.write(nicknames[i].split(" ")[j]);
            }
            bw.newLine();
        }
        br.close();
        bw.close();








//        int N = sc.nextInt();
//        String[] nickname = new String[N];
//
//
//        for(int i=0; i<N; i++){
//            nickname[i] = sc.next();
//            for(int j=1; j<nickname[i].length(); j++){
//                System.out.println("god" + nickname[i].split(" ")[j]);
//            }
//        }

    }

}
