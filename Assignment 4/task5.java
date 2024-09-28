//task 5

import java.util.Scanner;
public class task5{
  public static void main(String [] args){
   
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int input = s1.nextInt();
    int value = 1;
    int count = 1;
    int negative = 0, non_negative = 0;
    while(value <= input){     
      System.out.println("Enter number " + count + ":" );
      int num = s1.nextInt();
      
      if (num < 0){
        
        negative++;
        
      }
      else if (num > 0 || num == 0) {
    
        non_negative++;
        
          
      }

      count++;
      value++;
    }
    System.out.println(non_negative + " Non-Negative Numbers.");
    System.out.println(negative + " Negative Numbers.");
    
  }
  
}