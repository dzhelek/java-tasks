package lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Dir {
    public static void main(String[] args) {
        String path;
        try (var scn = new Scanner(System.in) ) {
            System.out.print("Enter directory: ");
            path = scn.nextLine();
        }
        try (
            var stream = Files.newDirectoryStream(Paths.get(path));
            var writer = Files.newBufferedWriter(Paths.get("lab7/directory_contents.txt"));
        ) {
            for (var file : stream) {
                if (Files.isDirectory(file)) {
                    writer.append(file.getFileName() + "/" + "\n");
                }
                else {
                    writer.append(file.getFileName() + "\n");
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("directory_contents.txt");
    }
}
