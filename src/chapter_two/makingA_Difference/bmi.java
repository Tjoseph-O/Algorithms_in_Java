package chapter_two.makingA_Difference;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Height in Inches");
        int height = input.nextInt();

        System.out.println("Enter your weight in pounds");
        int weight = input.nextInt();

        int bmiNumber = 703;
        int topFomular = weight * bmiNumber;
        int downFormular = height * height;

        int bmi = topFomular / downFormular;

        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi > 18.5) {
            System.out.println("Normal");
        } else if (bmi > 25 ) {
            System.out.println("Over");
        } else System.out.println("We dont have your result");


    }





}


