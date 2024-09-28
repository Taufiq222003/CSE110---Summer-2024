//task3
import java.util.Scanner;
public class task3{
  public static void main(String [] args){
   
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter number: ");
   
    int sqr = 1;
    
    while(true) {
         
      int value = s1.nextInt();
      if (value < 0){
        break;
      }
      sqr =(int)Math.pow(value,2);
      
      System.out.println(value + " ^ 2 = " + sqr);
      
      
      
    }
    
    
  }
  
}