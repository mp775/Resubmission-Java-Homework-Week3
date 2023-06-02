package week3writinghomework;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class FindInputValue {
    public static void main(String[] args) {
       // scanner declaring for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter any character:");
        char ch = scanner.next().charAt(0);
        // creating object
FindInputValue value = new FindInputValue();
value.findCharacter(ch);
scanner.close();

    }
    public void findCharacter(char ch){
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a ALPHABET");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT.");
        } else {
            System.out.println(ch + " is a SYMBOL.");
        }

        }

    }

