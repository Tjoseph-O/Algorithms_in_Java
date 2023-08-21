package goinghome;

import java.util.Scanner;

import static java.lang.System.exit;

public class Number3 {
    public static void main(String[] args) {
        number();
    }
    
    public static void number(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input your NUmber: 1-10");
        int num = input.nextInt();
        if (num  < 1 || num > 10) {
            System.out.println("Please try again");
           number();
        }

        if (num == 1) {
            System.out.println("ONE");
        } else if (num == 2) {
            System.out.println("TWO");
        } else if (num == 3) {
            System.out.println("THREE");
        } else if (num == 4) {
            System.out.println("FOUR");
        } else if (num == 5) {
            System.out.println("FIVE");
        } else if (num == 6) {
            System.out.println("SIX");
        } else if (num == 7) {
            System.out.println("SEVEN");
        } else if (num == 8) {
            System.out.println("EIGHT");
        } else if (num == 9) {
            System.out.println("NINE");
        } else if (num== 10) {
            System.out.println("TEN");
        }else System.out.println("Not a number");
        System.exit(0);
    }

    }

