package week3writinghomework;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
import java.util.Scanner;

public class FindPositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter any number:");
        int number= scanner.nextInt();
        FindPositiveOrNegative obj = new FindPositiveOrNegative();
        obj.positiveOrNegative(number);
    }
    public void positiveOrNegative(int number){
        if ( number>0){
            System.out.println(number +" is positive number");
        }else if(number<0){
            System.out.println(number + "is negative number");
        }else{
            System.out.println( number +"is a zero");
        }
    }
}

