package week3writinghomework;
/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class DividedByThreeAndFive {
    public static void main(String[] args) {
        System.out.println(" number divide by 3 are :");
        for (int i = 1; i <= 100; i++) {
            divideByThree(i);
        }
        System.out.println("\n-----------------");
        System.out.println(" Numbers divisible by 5 are:");
        for (int x = 1; x <= 100; x++) {
            divideByThree(x);
        }
        }
        public static void divideByThree( int number){
            if (number % 3 == 0) {
                System.out.println(number + " ");
            }

        }
    }

