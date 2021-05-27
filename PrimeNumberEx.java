package com.company;
import java.util.*;

class PrimeNumber{
    boolean method;
    PrimeNumber(boolean method){
        this.method = method;
    }
    
    public void printPrimeNumber(int number){   
        int remainder = 0;
        for(int CurrentNumber = 1; CurrentNumber <= number; CurrentNumber++){
           for(int PrimeNumberCheck = 2; PrimeNumberCheck <= (CurrentNumber - 1); PrimeNumberCheck++){
               if(CurrentNumber % PrimeNumberCheck == 0){
                   remainder = remainder + 1;
               }
           }
            if(remainder == 0){
                System.out.println(CurrentNumber + " Is a Prime number");
            }else {
                System.out.println(CurrentNumber + " Is not a Prime number");
                remainder = 0;
            }
        }

    }

    public void checkPrimeNumber(int number){
        int remainder = 0;
        for(int startNumber = 2; startNumber <= (number - 1); startNumber++){
            if (number%startNumber == 0){
                remainder = remainder + 1;
            }
        }
        if(remainder == 0){
            System.out.println(number + " Is a Prime number");
        }else {
            System.out.println(number + " Is not a Prime number");
            remainder = 0;
        }
    }

    public void run(int number){
        if(!method){
            checkPrimeNumber(number);
        } else {
            printPrimeNumber(number);
        }
    }
}

public class PrimeNumberEx {
    public static void main(String[] args) {

        int user_choice_input = 0;
        boolean whichMethod = false;
        int user_number_input = 0;

        // Take input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter (1). to check Prime number \nEnter (2). to Print Prime number Series");

        // Check input
        try {
            user_choice_input = input.nextInt();
        } catch (Exception e){
            System.out.println("ERROR :- Wrong input Try Again.");
        }

        // User demand what they want
        if(user_choice_input == 1){
            whichMethod = false;  // if false then 'checkPrimeNumber()' run
        } else if (user_choice_input == 2){
            whichMethod = true;  // if true then 'printPrimeNumber()' run
        } else {
            System.out.println("You enter a wrong number");
            System.exit(0);
        }

        // Take number by user
        Scanner input_2 = new Scanner(System.in);
        System.out.print("Enter Your number ");

        try{
            user_number_input = input_2.nextInt();
        } catch (Exception e){
            System.out.println("ERROR :- Wrong input Try Again.");
            System.exit(0);
        }

        // Make obj of PrimeNumber
        PrimeNumber primeNumber = new PrimeNumber(whichMethod);

        // run
        primeNumber.run(user_number_input);


    }
}
