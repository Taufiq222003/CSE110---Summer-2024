//task 3
import java.util.Scanner;
public class task3{
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = s1.nextInt();
        System.out.println("Enter the second number");
        int num2 = s1.nextInt();
        System.out.println("Enter the operator");
        String operator = s1.next();
        int result = 0;
        if (operator.equals("+")){
            result = num1 + num2;
        }
        else if (operator.equals("-")){
            result = num1 - num2;
        }
        else if (operator.equals("*")){
            result = num1 * num2;
        }
        else if (operator.equals("/")){
            result = num1 / num2;
        }
        else {
          System.out.println("Invalid operation");
        }
        System.out.println(num1 + operator + num2 + " = " + result);
    }
}