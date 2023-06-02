package week3writinghomework;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class DoOperationWithSymbol {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the first number:");
        int x = scanner.nextInt();
        System.out.println( " enter the second number:");
        int y = scanner.nextInt();
        System.out.println(" enter any symbol;");
        char symbol = scanner.next().charAt(0);
        DoOperationWithSymbol cal = new DoOperationWithSymbol();
        cal.calculationOfTwoNumber(x,y,symbol);
scanner.close();
    }
    public void calculationOfTwoNumber( int x,int y, char symbol){
        if (symbol== '+'){
            System.out.println(x + " + " + y + " = " + (x + y));
        }else if (symbol== '-'){
            System.out.println(x + " - " + y + " = " + (x - y));
        }else if (symbol== '*'){
            System.out.println(x + " * " + y + " = " + (x * y));
        }else if (symbol== '/'){
            System.out.println(x + " / " + y + " = " + (x / y));
        }else {
            System.out.println(" please enter correct symbol +,-, *,/");

        }
    }
}
