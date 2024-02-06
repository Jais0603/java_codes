import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

//Write a program to create a class BankAccount having instance variable balance.
//Implement a method deposit(int amt) which receives the amount to be deposited as an argument and adds to the current balance.
//Implement another method int withdraw) which asks the user to enter the amount to be withdrawn and updates the balance if having sufficient balance and return the new balance.
//Invoke both the methods from TestBankAccount class.

public class bankaccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the amount you wanna deposit:");
        int balance=20000;
        int deposit= scan.nextInt();
        int amount= balance+deposit;
        System.out.println("Amount Successfully deposited" );
        System.out.println("balance after successful deposit:" + " "+ amount);
        System.out.println("enter the amount you wanna withdraw");
        int withdraw= scan.nextInt();
        //int ;
         if(withdraw > amount){
            System.out.println("insufficient balance");
        }
        else{
            amount= amount- withdraw;
           System.out.println("balance after withdraw amount:"+ " " + amount );
        }

        

    }
}
