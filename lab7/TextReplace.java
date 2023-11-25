package lab7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReplace {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        var reader = new BufferedReader(new FileReader("lab7/replace.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}