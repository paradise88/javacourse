package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {



public static void main (String args[]){

    double baseCost;
    int overageMins;
    int tax = 15;
    double overageCost = 0.25;
    Scanner scanner = new Scanner(System.in);

   System.out.println("Enter base cost of the plan");
   baseCost = scanner.nextDouble();

    System.out.println("Enter overage minutes");
    overageMins = scanner.nextInt();

    System.out.println("Phone Bill Statement");
    System.out.println("Plan "+baseCost);
    System.out.println("Overage: "+calcOverageFees(overageMins, overageCost));
    System.out.println("Tax: "+calcTax(tax,(calcOverageFees(overageMins, overageCost)+baseCost) ));
    System.out.println("Total: "+calcTotal(baseCost,calcOverageFees(overageMins, overageCost),calcTax(tax,(calcOverageFees(overageMins, overageCost)+baseCost))));
}

public static double calcTax(int tax, double amount){
    double taxRate= tax;
    double calcTax = (taxRate/100)*amount;
    return calcTax;
}

public static double calcOverageFees(int minutes, double cost){
    double calcOverageFees = minutes*cost;
    return calcOverageFees;
}

public static double calcTotal(double plan, double overage, double tax){
    double calcTotal = plan + overage + tax;
    return calcTotal;

}

}
