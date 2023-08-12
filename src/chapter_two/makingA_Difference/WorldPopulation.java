package chapter_two.makingA_Difference;


import java.util.Scanner;



public class WorldPopulation {

    public static void main(String[] args) {

        display();


    }

    public static void display(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input The Growth Rate : ");
        double growthRate = input.nextDouble();

        System.out.println("Input The World Population");
        long worldPopulation = input.nextLong();

        for (int index = 1; index < 6; index++, worldPopulation *= growthRate) {
            System.out.printf("%d years = %d\n", index,worldPopulation);

        }

    }

}
