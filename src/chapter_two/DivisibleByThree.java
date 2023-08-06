package chapter_two;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (number % 3 == 0) System.out.println("Divisible by 3");else System.out.println("not");

    }
}
