package lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class CSVAnalysis {
    public static void main(String[] args) {
        double averageAge = 0;
        int recordsCount = 0;
        var cityCount = new HashMap<String, Integer>();
        var path = Paths.get("lab7/test.csv");
        try (var reader = Files.newBufferedReader(path)) {
            reader.readLine();
            String line;
            String[] record;
            while ((line = reader.readLine()) != null) {
                record = line.split(",");
                averageAge += Integer.parseInt(record[1]);
                if (cityCount.containsKey(record[2])) {
                    cityCount.replace(record[2], cityCount.get(record[2]));
                }
                else {
                    cityCount.put(record[2], 1);
                }
                recordsCount++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        averageAge /= recordsCount;
        System.out.println("Средна възраст: " + averageAge);
        for (var key : cityCount.keySet()) {
            System.out.println("Брой хора от " + key + ": " + cityCount.get(key));
        }
    }
}
