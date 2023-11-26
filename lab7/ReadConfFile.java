package lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadConfFile {
    public static void main(String[] args) {
        var path = Paths.get("lab7/config.txt");
        try (var reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                var s = line.split("=");
                System.out.println(s[0] + ": " + s[1]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
