//task 6
import java.util.Scanner;
public class task6{
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num1 = s1.nextInt();

        if (num1 < 0){
            System.out.println("The number is negative");
        }
        else if (num1 == 0){
            System.out.println("The number is zero");
        }
        else if (num1 > 0 && num1 % 2 == 0){
            System.out.println("The number is postive and even");
        }
        else if (num1 > 0 && num1 % 2 != 0){
            System.out.println("The number is postive and odd");
        }

    }
}