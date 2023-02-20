package chapter3;

import java.util.Scanner;

public class ChangeForAEuroGame {

    public static void main(String args[]){

        double amount = 0;
        int count;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many one Cent coins do you want to add?");
        count = scanner.nextInt();
        amount = amount + 0.01 * count;

        System.out.println("How many two Cent coins do you want to add?");
        count = scanner.nextInt();
        amount = amount + 0.02 * count;

        System.out.println("How many five Cent coins do you want to add?");
        count = scanner.nextInt();
        amount = amount + 0.05 * count;

        System.out.println("How many ten Cent coins do you want to add?");
        count = scanner.nextInt();
        amount = amount + 0.10 * count;

        System.out.println("How many twenty Cent coins do you want to add?");
        count = scanner.nextInt();
        amount = amount + 0.20 * count;

        System.out.println("How many fifty Cent coins do you want to add?");
        count = scanner.nextInt();
        amount = amount + 0.50 * count;

    if (amount > 1.00){
        double above = amount-1;
        System.out.println("You loose, you are "+above+"€ above 1€");
    }

    if (amount < 1.00){
        double below = 1-amount;
        System.out.println("You loose, you are "+below+"€ below 1€");
    }
    if (amount == 1.00){
            System.out.println("You WIN, you´ve reached exactly: "+amount+"€");
        }
    }
}
