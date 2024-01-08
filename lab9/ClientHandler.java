package lab9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{
    Socket socket;

    public ClientHandler (Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try (
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            String text = in.readLine();
            // Thread.sleep(5000);
            System.out.println(text + Math.random());
        } catch (IOException e) {
            e.printStackTrace();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        }
    }
}
