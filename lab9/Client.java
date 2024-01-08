package lab9;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 1234);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        // BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out.println("haha");
        var scan = new Scanner(System.in);
        scan.hasNext();
    }
}
