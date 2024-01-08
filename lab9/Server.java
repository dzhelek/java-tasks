package lab9;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

public class Server {
    static List<Car> cars = new ArrayList<>();

    static void addFirstCars() {
        cars.add(new Car("BMW", "X6", 65000));
        cars.add(new Car("Audi", "A5", 40000));
        cars.add(new Car("Porshe", "911", 100000));
    }

    public static void main(String[] args) throws IOException {
        addFirstCars();

        try(
            var serverSocket = new ServerSocket(1234);
        ){
            System.out.println("ready");

            var pool = Executors.newFixedThreadPool(3);
            for (;;) {
                System.out.println("client connected...");
                var socket = serverSocket.accept();
                var thread = new ClientHandler(socket);
                pool.execute(thread);
            }
        }
    }
}