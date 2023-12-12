package lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilterLog {
    public static void main(String[] args) {
        var path = Paths.get("lab7/log.txt");
        try (var reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("ERROR:")) {
                    System.out.println(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
