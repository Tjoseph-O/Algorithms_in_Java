package chapter14;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("write you words");
        String words = input.next();


        char[] resultInput = words.toCharArray();

        Pattern pattern = Pattern.compile("//s");


        for (int index = resultInput.length - 1; index >= 0; index--) {

            System.out.print(resultInput[index]);

        }
    }
}





//    public String findMostString(String input){
//        var map = Stream.of(input.chars())
//                .collect(Collectors.toMap(x-> x, x-> 1, (x,y)->x+y));
//        map.get()
//    }


//    public String findMostFreqCharacter3(String input) {
//
//
//    }



