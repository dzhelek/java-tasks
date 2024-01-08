package servers;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.util.Scanner;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        int number;

        var server = new ServerSocket(1234);
        var socket = server.accept();
        var scan = new Scanner(socket.getInputStream());
        var printout = new PrintStream(socket.getOutputStream());

        number = scan.nextInt();
        if (number % 2 == 0) {
            printout.println("even");
        }
        else {
            printout.println("odd");
        }
        server.close();
        scan.close();
    }
}
