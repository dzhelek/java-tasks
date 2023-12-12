package atm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // connecting to server on the localhost and port 1234
        Socket socket = new Socket("127.0.0.1", 1234);
        
        Scanner scan = new Scanner(System.in);

        // creating readers and writers for communication with the server
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();
        Scanner reader = new Scanner(in);
        PrintStream writer = new PrintStream(out);

        //////////////////////////

        var text = reader.nextLine(); // read data from the server
        System.out.println(text);
        var bankNumber = scan.nextInt();
        writer.println(bankNumber);
        while (reader.hasNextLine()) {
            System.out.println("1");
            text = reader.nextLine();
            System.out.println(text);
            if (text.contains("Enter")) {
                break;
            }
        }
        var pin = scan.nextInt();
        writer.println(pin);
        text = reader.nextLine();
        System.out.println(text);

        //////////////////////////

        reader.close();
        writer.close();
        socket.close();
        scan.close();

        // server_scan.close();
        // socket.close();
    }
}