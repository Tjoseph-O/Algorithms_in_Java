package task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ProductFile {

    public static void main(String[] args) {
        String locationOfFile = "/home/joseph/Desktop/filesJava/product.json";
        Path path1 = Path.of(locationOfFile);
        try (BufferedWriter productList = Files.newBufferedWriter(path1)){
            productList.write("""
                    {
                    "name": "milk",
                    "price": "500",
                    "quantity": "10",
                    "id": "01",
                    "branch": "lagos"
                    
                    },
                    
                      {
                    "name": "tea",
                    "price": "500",
                    "quantity": "10",
                    "id": "02",
                    "branch": "lagos"
                    
                    },
                    
                      {
                    "name": "milk",
                    "price": "500",
                    "quantity": "10",
                    "id": "03",
                    "branch": "lagos"
                    
                    },
                    
                      {
                    "name": "milk",
                    "price": "500",
                    "quantity": "10",
                    "id": "04",
                    "branch": "lagos"
                    
                    },
                    
                      {
                    "name": "milk",
                    "price": "500",
                    "quantity": "10",
                    "id": "05",
                    "branch": "lagos"
                    
                    },
                    
                      {
                    "name": "milk",
                    "price": "500",
                    "quantity": "10",
                    "id": "06",
                    "branch": "lagos"
                    
                    },
                    
                      {
                    "name": "Cap",
                    "price": "500",
                    "quantity": "10",
                    "id": "07",
                    "branch": "lagos"
                    
                    },
                    
                      {
                    "name": "Shoes",
                    "price": "400",
                    "quantity": "80",
                    "id": "08",
                    "branch": "lagos"
                    
                    },
                    
                      {
                    "name": "Bible",
                    "price": "50000",
                    "quantity": "200",
                    "id": "09",
                    "branch": "Osun"
                    
                    },
                    
                      {
                    "name": "Sugar",
                    "price": "1000",
                    "quantity": "100",
                    "id": "10",
                    "branch": "Abuja"
                    
                    }
                    
                    """);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }

        try (BufferedReader bufferedReader = Files.newBufferedReader(path1)){
            Stream<String> contentOfFile = bufferedReader.lines();
            contentOfFile.forEach(System.out::println);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }


    }
}
