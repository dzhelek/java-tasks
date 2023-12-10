package lab8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockTicker {
    Map<String, List<Double>> stocks = new HashMap<>();
    public static void main(String[] args) {
        var ticker = new StockTicker();
        ticker.updatePrice("AAPL", 150);
        ticker.updatePrice("AAPL",300);
        ticker.getLastPrice("AAPL");
    }
    private void getLastPrice(String stock) {
        System.out.println(stocks.get(stock).getLast());
    }
    private void updatePrice(String stock, double price) {
        var history = stocks.putIfAbsent(stock, List.of(price));
        if (history != null) {
            history = new ArrayList<>(history);
            history.add(price);
            stocks.put(stock, history);
        }
    }
}
