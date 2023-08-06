package chapter_two;

import java.util.Scanner;

public class ComparingIntegers {

    int number;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int number = input.nextInt();

        int square = number * number;

      if (number > 100){
          System.out.println("Integer Greater than 100");
      }else System.out.println("Integer less than 100");
      if (square > 100){
          System.out.println("Square Greater than 100");
      }







    }


}


