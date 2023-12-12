package lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLFinder {
    public static void main(String[] args) {
        var path = Paths.get("lab7/replace.txt");
        var pattern = Pattern.compile("https?://[^\\s]+[\\w/]");
        Matcher matcher;
        try (var reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                matcher = pattern.matcher(line);
                while (matcher.find())
                    System.out.println(matcher.group());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
