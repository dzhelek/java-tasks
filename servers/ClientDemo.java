package servers;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        int number;

        var socket = new Socket("127.0.0.1", 1234);
        var scan_user = new Scanner(System.in);
        var scan_server = new Scanner(socket.getInputStream());
        var printout = new PrintStream(socket.getOutputStream());

        System.out.println("number = ");

        number = scan_user.nextInt();
        printout.println(number);
        var input_server = scan_server.nextLine();
        System.out.println(input_server);

        scan_server.close();
        scan_user.close();
        socket.close();
    }
}
