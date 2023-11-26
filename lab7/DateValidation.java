package lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class DateValidation {
    public static void main(String[] args) {
        var path = Paths.get("lab7/dates.txt");
        var pattern = Pattern.compile("([012][0-9]|3[01])/(0[0-9]|1[012])/[0-9]{4}");
        try (var reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                var matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    System.out.println(line + " - валидна");
                }
                else {
                    System.out.println(line + " - невалидна");
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
