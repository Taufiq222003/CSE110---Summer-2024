//task 1
import java.util.Scanner;
public class task1{
    public static void main(String [] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = s1.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = s1.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = s1.nextInt();
        int largest = 0;

        if(num1 > num2 && num1 > num3){
            largest = num1;
        }
        else if (num2 > num3 && num2 > num1){
            largest = num2;

        }
        else {
            largest = num3;
        }
        System.out.println("The largest number is : " + largest);

       
    }

}