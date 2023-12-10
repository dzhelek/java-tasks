package lab8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventLog {
    HashMap<LocalDate, String> events = new HashMap<>();
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    void addEvent(String date, String description){
        events.put(LocalDate.parse(date, dateFormat), description);
    }

    List<String> getEventsBetween(String from, String to){
        var eventsBetween = new ArrayList<String>();
        var dateFrom = LocalDate.parse(from, dateFormat);
        var dateTo = LocalDate.parse(to, dateFormat);
        String event;

        for(var date = dateFrom; date.isBefore(dateTo); date = date.plusDays(1)) {

            if ((event = events.get(date)) != null) {
                eventsBetween.add(event);
            }
        }

        return eventsBetween;
    }
    public static void main(String[] args){
        var log = new EventLog();
        log.addEvent("2023-01-01", "Нова година");
        var a = log.getEventsBetween("2023-01-01", "2023-06-01");
        System.out.println(a);
    }
}
