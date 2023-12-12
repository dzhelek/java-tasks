package lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SearchPrefix {
    public static void main(String[] args) {
        String prefix;
        try (var scn = new Scanner(System.in) ) {
            System.out.print("Enter prefix: ");
            prefix = scn.nextLine();
        }

        var path = Paths.get("lab7/words.txt");
        try (var reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(prefix)) {
                    System.out.println(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
