package chapter_two;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The First Integer: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter The Second Integer: ");
        int secondNumber = input.nextInt();

        int firstSquare = firstNumber * firstNumber;
        int secondSquare = secondNumber * secondNumber;


        System.out.println("Square of the First Number: " + firstSquare);
        System.out.println("Square of the Second Number: " + secondSquare);

        System.out.println("Adding the Squares of both Integer: " + firstSquare + secondSquare);

        System.out.println(firstSquare - secondSquare);











    }


}
