package Day_01_Java_Class_and_Object_Level_2;

import java.util.Scanner;

class PalindromeChecker{
    String text;

    // creating a constructor
    public PalindromeChecker(String text){
        this.text=text;
    }

    // isPalindrome method for check string is palindrome or not
    public boolean isPalindrome(){
        int st=0;
        int end=text.length()-1;
       while (st<end){
           if(text.charAt(st)!=text.charAt(end)){
               return false;
           }
           st++;
           end--;
       }
       return true;
    }
    // display methods for display a result
    public void displayResult(){
        if(isPalindrome()){
            System.out.println("it is a palindrome String : "+text);
        }else {
            System.out.println("not a plaindrome String : " +text);
        }
    }

}
public class CheckPalindromeString {
    public static void main(String[] args) {
        //take input from the user
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String");
        String text=input.nextLine();

        //create a palindrome class object

        PalindromeChecker pl=new PalindromeChecker(text);
        pl.displayResult();

    }
}
