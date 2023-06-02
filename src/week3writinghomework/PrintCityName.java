package week3writinghomework;

import java.util.Scanner;

/**
        * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
        * any other alphabet should be invalid entry
        */
public class PrintCityName {
    public static void main(String[] args) {
       // scanner declaration for reading from console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter any alphabet between A to F:");
        char city = scanner.next().charAt(0);
        //object created
        PrintCityName typ = new PrintCityName();
        typ.cityName(city);
scanner.close();
    }

    public void cityName(char city) {
        if (city == 'A' || city == 'a') {
            System.out.println("Aberdeen");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Belfast");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Cambridge");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Derby");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Edinburgh");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Feltham");
        } else {
            System.out.println("The alphabet you enter is not between A to F");
        }
    }
}

