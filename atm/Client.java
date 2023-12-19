package atm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        try (
            // connecting to server on the localhost and port 1234
            Socket socket = new Socket("127.0.0.1", 1234);
            
            Scanner scan = new Scanner(System.in);

            // creating readers and writers for communication with the server
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
            Scanner reader = new Scanner(in);
            PrintStream writer = new PrintStream(out);
        ){
            var text = reader.nextLine(); // read data from the server
            System.out.println(text);
            var bankNumber = scan.nextInt(); // read data from user
            writer.println(bankNumber); // send to server
            
            do {
                text = reader.nextLine();
                System.out.println(text);
            } while (!text.contains("Enter"));

            var pin = scan.nextInt();
            writer.println(pin);
            text = reader.nextLine();
            System.out.println(text);
        }
    }
}
