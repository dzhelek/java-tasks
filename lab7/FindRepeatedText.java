package lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatedText {
    public static void main(String[] args) {
        var path = Paths.get("lab7/replace.txt");
        Pattern pattern;
        Matcher matcher;
        String text;
        int i = 0;
        try {
            List<String> lines = Files.readAllLines(path);
            // System.out.println(text);
            for (var line : lines) {
                text = String.join("", lines.subList(i++, lines.size()));
                pattern = Pattern.compile(line);
                matcher = pattern.matcher(text);
                if (matcher.find() && matcher.find()) {
                    System.out.println(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
