package task;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ProductReader {
    public static void main(String[] args) {

        String locationOfFile = "/home/joseph/Desktop/filesJava/product.json";

        Path filePath = Paths.get(locationOfFile);
        
        try (BufferedReader bufferedReader = Files.newBufferedReader(filePath)){
            Stream<String> contentOfFile = bufferedReader.lines();
            contentOfFile.forEach(System.out::println);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }



    }
}
