//task 13
import java.util.Scanner;
public class task13{
    public static void main(String [] args){
      
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        int num1 = s1.nextInt();
        System.out.println("Input the 2nd number: ");
        int num2 = s1.nextInt();
        System.out.println("Input the 3rd number: ");
        int num3 = s1.nextInt();
        
        
        if (num1 == num2 && num2 == num3){
          System.out.println("All numbers are equal ");
        }
        else if (num1 != num2 && num2 != num3){
          System.out.println("All numbers are different ");
        }
        else if ((num1==num2 && num2!=num3) || (num2==num3 && num3!=num1) || (num1==num3 && num3!=num2)){
          System.out.println("Neither all are equal or different ");
        }
       


    }
}
