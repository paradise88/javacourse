package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollTheDieGame {

    public static void main(String args[]) {

        int gameBoard = 20;
        int progression = 0;
        int toGo = 0;
        //  String message;
        boolean start = false;
        boolean validInput = false;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello and welcome to the die game, the program will roll the die 5 times. If all rolles accumalte to exact 20 you win, else you LOSE!");

        while (validInput == false) {

            System.out.println("Would you like to start? y/n");
            String input = scanner.next();

            switch (input) {
                case "y":
                    validInput = true;
                    start = true;
                    break;
                case "n":
                    validInput = true;
                    System.out.println("Thank you for wasting my time, good bye");
                    break;
                default:
                    System.out.println("Wrong input, please try again");
                    break;

            }
        }


        if (start == true ){
            System.out.println("The game starts");

            for(int i = 1; i<6;i++){
            progression = progression + (random.nextInt(6)+1);
            toGo = gameBoard-progression;
           // System.out.println(toGo);
            if (progression <= 20 )
            System.out.println("After the #"+i+" roll you are at position "+progression+" with "+toGo+" more to go");
                if (progression > 20 )
                    System.out.println("After the #"+i+" roll you are at position "+progression+" with "+toGo*-1+" over 20");
            }
            }
            if (progression > 20 )
                System.out.println("You loose! You are "+toGo*-1+" over 20");
            if (progression < 20 )
                System.out.println("You loose! You are "+(toGo)+" below 20");
            if (progression == 20 )
                System.out.println("You win!");
        }


    }
