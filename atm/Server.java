package atm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        List<Account> bankAccounts = new ArrayList<>();
        bankAccounts.add(new Account(1001, 0, 1234));
        bankAccounts.add(new Account(1002, 10, 1234));
        bankAccounts.add(new Account(1003, 100, 1234));
        bankAccounts.add(new Account(1004, 1000, 1234));
        // creating server connected to TCP port 1234
        ServerSocket server = new ServerSocket(1234);
        // listening for new connections
        Socket socket = server.accept();

        // creating input and output streams
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();
        Scanner reader = new Scanner(in);
        PrintStream writer = new PrintStream(out);
    
        //////////////////////////

        writer.println("Welcome! Enter account number: "); // send data to client
        var bankNumber = reader.nextInt();
        System.out.println(bankNumber);
        Account accountFound = null;
        for (var bankAccount : bankAccounts) {
            if (bankAccount.getAccountNumber() == bankNumber) {
                accountFound = bankAccount;
                writer.println("Bank account found with that number!");
                break;
            }
        }
        if (accountFound == null) {
            writer.println("No bank account found with that number! Bye!");
            server.close();
            return;
        }

        writer.println("Enter pin code: ");
        var pin = reader.nextInt();
        if (accountFound.checkPin(pin)) {
            writer.println("PIN is correct!");
        }
        else {
            writer.println("Try again!");
            socket.close();
            return;
        }

        //////////////////////////

        in.close();
        out.close();
        reader.close();
        writer.close();
        socket.close();
        server.close();
        
        // creating stream for sending data to client
        // PrintWriter client_out = new PrintWriter(socket.getOutputStream());
        // client_out.println("hi"); // send "hi" to the client

        // server.close();
    }
}
