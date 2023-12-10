package lab8;

import java.util.HashMap;
import java.util.Map;

public class WebServer {
    Map<Request, Integer> requests = new HashMap<>();
    public static void main(String[] args) {
        var server = new WebServer();
        server.addRequest(new WebServer.Request("/home", 200));
        server.getRequestStats();
    }

    private void addRequest(Request request) {
        var times = requests.putIfAbsent(request, 1);
        if (times != null) {
            requests.put(request, times+1);
        }
    }

    private void getRequestStats() {
        for (var request : requests.keySet()) {
            System.out.println(request.status + " " + request.path + " - " + requests.get(request));
        }
    }

    public static class Request {
        String path;
        int status;

        public Request(String path, int status) {
            this.path = path;
            this.status = status;
        }
    }
}
