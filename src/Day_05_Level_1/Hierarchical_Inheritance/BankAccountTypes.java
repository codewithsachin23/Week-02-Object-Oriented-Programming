package Day_05_Level_1.Hierarchical_Inheritance;

// Base class representing a general bank account
class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor to initialize account number and balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display general account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("Account Type: General Bank Account");
    }
}

// Subclass representing a savings account
class SavingsAccount extends BankAccount {
    private double interestRate;


    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call superclass constructor
        this.interestRate = interestRate;
    }
    // Method to display interest rate
    public void displayInterestRate() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Overridden method to display account type for savings account
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }


}


class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overridden method to display account type for checking account
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    // Method to display withdrawal limit
    public void displayWithdrawalLimit() {
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}


class FixedDepositAccount extends BankAccount {
    private double depositAmount;


    public FixedDepositAccount(String accountNumber, double balance, double depositAmount) {
        super(accountNumber, balance); // Call superclass constructor
        this.depositAmount = depositAmount;
    }

    // Overridden method to display account type for fixed deposit account
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    // Method to display deposit amount
    public void displayDepositAmount() {
        System.out.println("Fixed Deposit Amount: " + depositAmount);
    }
}

// Main class to test the banking system hierarchy
public class BankAccountTypes {
    public static void main(String[] args) {
        // Create objects for each account type
        SavingsAccount savingsAccount =new SavingsAccount("745954156766",5000,11);
        savingsAccount.displayAccountDetails();
        savingsAccount.displayAccountType();
        savingsAccount.displayInterestRate();
        System.out.println();


        CheckingAccount checkingAccount=new CheckingAccount("745954156766",5000,5000);
        checkingAccount.displayAccountDetails();
        checkingAccount.displayAccountType();
        checkingAccount.displayWithdrawalLimit();
        System.out.println();

        FixedDepositAccount fixedDepositAccount=new FixedDepositAccount("5274541654551",500000,5000);
        fixedDepositAccount.displayAccountDetails();
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayDepositAmount();



    }
}
