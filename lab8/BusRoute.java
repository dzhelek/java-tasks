package lab8;

import java.util.LinkedList;
import java.util.Queue;

public class BusRoute {
    Queue<String> stops = new LinkedList<>();

    void addStop(String stop) {
        stops.offer(stop);
    }

    String getNextStop() {
        return stops.poll();
    }

    public static void main(String[] args) {
        var route = new BusRoute();
        route.addStop("Спирка 1");
        var a = route.getNextStop();
        System.out.println(a);
    }
}
