package week3writinghomework;
/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class LeapYea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter year:");
        int year =scanner.nextInt();
       // creating object
        LeapYea obj = new LeapYea();
        //calling object
        obj.isItLeapYear( year);
        //close the scanner
        scanner.close();

    }
    //declaring instance method
    public void isItLeapYear( int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is leap year ");
            return;
        }
        System.out.println("The year " + year + " is not a leap year ");
        }
    }


