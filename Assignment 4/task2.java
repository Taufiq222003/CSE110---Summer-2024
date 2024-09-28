//task2
import java.util.Scanner;
public class task2{
  public static void main(String [] args){
   
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int input = s1.nextInt();
    System.out.println("Input the "+ input + " numbers.");
    int sum = 0;
    double average;
    for (int i = 1; i <= input; i++){
      
      int value = s1.nextInt();
      
      sum = sum + value;
      
      
    }
    average = sum / input;
    System.out.println("The sum of " + input + " is: " + sum);
    System.out.println("The average is " + average);
  }
  
}