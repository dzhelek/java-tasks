package lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateIndex {
    public static void main(String[] args) {
        String word;
        try (var scn = new Scanner(System.in)) {
            System.out.print("Enter word: ");
            word = scn.nextLine();
        }

        var path = Paths.get("lab7/replace.txt");
        var pattern = Pattern.compile(word);
        Matcher matcher;
        int currentLine = 0;

        try (var reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                matcher = pattern.matcher(line);
                if (matcher.find()) {
                    System.out.println(currentLine + ":" + matcher.start());
                }
                currentLine++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
