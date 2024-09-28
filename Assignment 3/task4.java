//task 4
import java.util.Scanner;
public class task4{
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num1 = s1.nextInt();

        if (num1 % 5 == 0 && num1 % 7 == 0){
            System.out.println("Divisible by Both");
        }
        else if (num1 % 5 == 0){
            System.out.println("Invalid: Divisible by 5 Only");
        }
        else if (num1 % 7 == 0){
            System.out.println("Invalid: Divisible by 7 Only");
        }
        else {
            System.out.println("No");
        }
    }
}