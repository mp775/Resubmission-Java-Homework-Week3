package week3writinghomework;
/**
        * Write a java program input seller id, sellers name, sales amount, and basic salary
        * then fined this sales
        * Commission
        * Sales amount &gt;= 50,000 35%
        * Sales amount &gt;= 30,000 20%
        * &gt;= 20,000 10%
        * &gt;= 10,000 5%
        * &lt; 10,000 2%
        *
        */
import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter seller name:");
        String name = scanner.nextLine();
        System.out.println(" Enter seller Id: ");
        int sellerId = scanner.nextInt();
        System.out.println( " Enter sales Amount:");
        int saleAmount = scanner.nextInt();
        System.out.println(" Enter Basic Salary:");
        int basicSalary = scanner.nextInt();
        SalesCommission obj = new SalesCommission();
        int grossSalary = basicSalary + obj.calculateCommission(saleAmount);
        System.out.println("Seller name is            : " + name);
        System.out.println("Seller id is              : " + sellerId);
        System.out.println("Seller's sales amount is  : " + saleAmount);
        System.out.println("Seller's basic salary is  : " + basicSalary);
        System.out.println("Seller's gross salary is  : " + grossSalary);
        // closing the scanner object
        scanner.close();
    }



    public int calculateCommission( int salaryAmount){
        int commission;
        if (salaryAmount >= 50000) {
            commission = (salaryAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salaryAmount >= 30000) {
            commission = (salaryAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salaryAmount >= 20000) {
            commission = (salaryAmount * 10) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salaryAmount >= 10000) {
            commission = (salaryAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (salaryAmount * 2) / 100;
            System.out.println("Sales Commission is " + commission);
        }
        return commission;
    }

}



