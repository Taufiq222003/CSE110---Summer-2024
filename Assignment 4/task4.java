//task 4
import java.util.Scanner;
public class task4{
  public static void main(String [] args){
   Scanner s1 = new Scanner(System.in);
   System.out.println("Enter a positive integer");
   int number = s1.nextInt();
   int n =1;
   System.out.println("The divisors are: ");
   while (n <= number){
     if(number % n == 0){
       System.out.println(n);
     }
   n++;
   }
   
  }
}