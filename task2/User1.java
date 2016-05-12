import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class User1 {
    public static void main(String[] args) {
        try {


            ServerSocket ss = new ServerSocket(10222);
            Socket s = ss.accept();



            Thread t = new Thread() {
                public void run() {
                    try {

                        while (true) {
                            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                            String str = br2.readLine();
                            bw.write(str, 0, str.length());
                            bw.newLine();
                            bw.flush();
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();



            while (true) {
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                System.out.println(br.readLine());
            }




        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

