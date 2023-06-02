package week3writinghomework;

import java.util.Scanner;
/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class FindTheDayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input number between 1 to 7: ");
        int day = scanner.nextInt();
        FindInputValue obj = new FindInputValue();
        findingDay(day);

    }
    public static void findingDay(int day){
        switch (day ){
            case 1:
                System.out.println(" monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println(" wednesday");
                break;
            case 4:
                System.out.println(" thursday");
                break;
            case 5:
                System.out.println(" friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
            default:
                System.out.println("week contain 1 to 7 days");

        }

    }
}
