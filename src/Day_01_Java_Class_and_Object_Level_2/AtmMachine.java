package Day_01_Java_Class_and_Object_Level_2;

import java.util.Scanner;

class BankAccount{
    // Attributes of the BankAccount

    String accountHolder;
    String accountNumber;
    int balance;
    // Constructor to initialize the BankAccount

    public BankAccount(String accountHolder,String accountNumber,int balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    // Method to deposit money

    public void depositingMoney(int amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    // Method to withdraw money

    public void withdrawingMoney (int amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance to withdraw " + amount);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }

    }
    // Method to display current balance

    public void  currentBalance(){
        System.out.println("current balance is :" + balance);
    }
    // Method to display account details

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        currentBalance();
    }
}



public class AtmMachine {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Account Holder's Name: ");
        String accountHolder=input.nextLine();
        System.out.print("Enter Account Number: ");
        String accountNumber=input.nextLine();
        System.out.print("Enter Initial Balance: ");
        int balance = input.nextInt();


        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        account.displayAccountDetails();

        while (true){
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            System.out.print("Select an option: ");
            int option = input.nextInt();


            switch (option){
                case 1:
                    System.out.println("Enter the amount to deposit");
                    int depositMoney=input.nextInt();
                    account.depositingMoney(depositMoney);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw:");
                    int withdrawMoney=input.nextInt();
                    account.withdrawingMoney(withdrawMoney);
                    break;
                case 3:
                    account.currentBalance();
                    break;
                case 4:
                    // Exit the program

                    System.out.println("Thank you for using the ATM!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
}
