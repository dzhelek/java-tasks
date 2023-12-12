package lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class TextReplace {
    public static void main(String[] args) {
        var path = Paths.get("lab7/replace.txt");
        System.out.println(Files.exists(path));
        try {
            var content = Files.readString(path);
            var pattern = Pattern.compile("старо");
            var matcher = pattern.matcher(content);
            var newContent = matcher.replaceAll("ново");
            Files.writeString(path, newContent);
        }
        catch (IOException e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }

        System.out.println("ok");
    }
}