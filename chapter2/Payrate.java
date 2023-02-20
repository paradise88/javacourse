package chapter2;

import java.util.Scanner;

public class Payrate {
    public static void main(String arg[]){
System.out.println("Enter number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        double workinghours = scanner.nextDouble();


        System.out.println("Enter Employees pay rate.");
        double rate = scanner.nextDouble();

double payrate = workinghours*rate;

System.out.println("The pay rate = "+payrate+"€");

    }
}


