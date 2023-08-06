package chapter_two;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter the number: ");
        int secondNumber = input.nextInt();

        System.out.println("Enter the number: ");
        int thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;

        int average = sum / 3;

        System.out.println(sum);

        System.out.println(average);
    }
}
