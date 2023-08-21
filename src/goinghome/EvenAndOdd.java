package goinghome;

import java.util.Objects;
import java.util.Scanner;

public class EvenAndOdd {

    public static void main(String[] args) {

display();
    }

    public static void display(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input your Numbers : ");
        int numbers = input.nextInt();
        if (numbers % 2 == 0) {
            System.out.println(numbers +" is Even");
        }else System.out.println(numbers + " is Odd");
        display();
        System.out.print("\n Do you want to continue (y or n)?");
        char answer = input.next().charAt(0);
        if(answer != 'y'){
           System.exit(0);
        }else display();


    }



//    public static void   exit(){
//        Scanner input = new Scanner(System.in);
//        String write = input.nextLine();
//        if (Objects.equals(write, "done")) {
//            System.exit(0);
//
//        }
//
//    }

//    public static void takeNumbers(){
//        display();
//
//    }


}
