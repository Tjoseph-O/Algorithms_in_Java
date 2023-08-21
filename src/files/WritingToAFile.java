package files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WritingToAFile {
    public static void main(String[] args) {
        String location = "/home/joseph/Desktop/files/joy.txt";
        Path path = Paths.get(location);
        try(BufferedWriter writer = Files.newBufferedWriter(path)){
            writer.write("joy likes Mango");
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }

    }
}
