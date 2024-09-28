//task 10
import java.util.Scanner;
public class task10{
  public static void main(String [] args){
  Scanner s1 = new Scanner(System.in);
  System.out.println("Enter the first float number: ");
  float f1 = s1.nextFloat();
  System.out.println("Enter the second float number: ");
  float f2 = s1.nextFloat();
  System.out.println("Enter the third float number: ");
  float f3 = s1.nextFloat();
  
  if (f1 > f2 && f1 > f3){
    System.out.println("Maximum number is " + f1);
  }
  else if (f2 > f3 && f2 > f1){
    System.out.println("Maximum number is " + f2);
  }
  else {
    System.out.println("Maximum number is " + f3);
  }
  
  if (f1 < f2 && f1 < f3){
    System.out.println("MInimum number is " + f1);
  }
  else if (f2 < f3 && f2 < f1){
    System.out.println("Minimum number is " + f2);
  }
  else {
    System.out.println("Minimum number is " + f3);
  }
  
  
  }
}

