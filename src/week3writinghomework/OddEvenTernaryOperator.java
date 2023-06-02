package week3writinghomework;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class OddEvenTernaryOperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" enter the number:");
        int number =s.nextInt();
oddEvenNumber(number);
s.close();
    }
    // Checking the number is even or odd
    public static void oddEvenNumber( int number){
        //ternary operator is used
        String evenOrOdd=(number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number" );
    }

}
