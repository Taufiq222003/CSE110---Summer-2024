//task 12
import java.util.Scanner;
public class task12{
  public static void main(String [] args){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay(Taka)");
    int amount = s1.nextInt();
    System.out.println("Enter the amount, customer gave(Taka)");
    int recieved_amount = s1.nextInt();
    int change,to_be_paid,tk_100,tk_50,tk_20,tk_10,tk_5,tk_2,tk_1;
    
    
    if (recieved_amount > amount){
      change = recieved_amount - amount;
      tk_100 = change / 100;
      tk_50 = change % 100 / 50;
      tk_20 = change % 100 % 50 / 20;
      tk_10 = change % 100 % 50 % 20 / 10;
      tk_5 = change % 100 % 50 % 20 % 10 / 5;
      tk_2 = change % 100 % 50 % 20 % 10 % 5 / 2;
      tk_1 = change % 100 % 50 % 20 % 10 % 5 % 2 / 1;
      System.out.println("The returned amount is " + change + " taka.");
      System.out.println("100 taka note: " + tk_100);
      System.out.println("50 taka note: " + tk_50);
      System.out.println("20 taka note: " + tk_20);
      System.out.println("10 taka note: " + tk_10);
      System.out.println("5 taka coin: " + tk_5);
      System.out.println("2 taka coin: " + tk_2);
      System.out.println("1 taka coin: " + tk_1);
      
    }
    
    else if (recieved_amount < amount){
      to_be_paid = amount - recieved_amount;
      System.out.println("Please pay " + to_be_paid + " taka more.");
      
    }
    
    else {
    System.out.println("The returned amount is 0 taka.");
    }
    
    
  } 
}