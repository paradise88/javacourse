package chapter2;

import java.util.Scanner;

public class MadLibs {


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide an adjective");
        String adjective = scanner.next();

        System.out.println("Please provide a Season of the Year");
        String season = scanner.next();

        System.out.println("Please provide a number");
        int number = scanner.nextInt();

        System.out.println("On a "+adjective+" "+season+" day, I drink a minimum of "+number+" pints of beer.");

    }


}
