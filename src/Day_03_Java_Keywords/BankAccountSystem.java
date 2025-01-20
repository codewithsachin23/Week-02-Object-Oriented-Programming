package Day_03_Java_Keywords;


class BankAccount{
    static String bankName="SBI Bank";
    static int totalNumberOfAccount;

    final String accountNumber;
    String accountHolderName;


    public BankAccount(String accountNumber,String accountHolderName){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        totalNumberOfAccount++;

    }
    public static void getTotalAccounts(){
        System.out.println("Total number of account :"+totalNumberOfAccount);

    }
     void display(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }


}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount bank1=new BankAccount("4454574284474","Sachin Shukla");
        BankAccount bank2=new BankAccount("5454542145625","Sachin Shukla");

            //calling a Static method directly
        BankAccount.getTotalAccounts();

        System.out.println("-----------------------------");

            //check it is instance of class or not and displaying result
        if(bank1 instanceof BankAccount) {
            System.out.println("Details of First Account");
            bank1.display();
        }else {
            System.out.println("This is not a instance of class");
        }
        System.out.println("-----------------------------");
            //check it is instance of class or notand displaying result
        if(bank1 instanceof BankAccount) {
            System.out.println("Details of second Account");
            bank2.display();
        }else {
            System.out.println("This is not a instance of class");
        }

    }

}
