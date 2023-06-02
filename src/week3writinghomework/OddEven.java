package week3writinghomework;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the  number you want to check: ");
        int number =scanner.nextInt();
        OddEven obj = new OddEven();
        System.out.println( number + " is " + obj.isItOddOrEven (number) + " number");
        //Scanner close
        scanner.close();


    }
    //checking the odd even number
    public String isItOddOrEven( int number){
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
