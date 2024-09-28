//task11
import java.util.Scanner;
public class task11 {
    public static void main(String [] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int input = s1.nextInt();
        int number = 0;
        int count = 0;
        int number2 = 0;
        int sum = 0;

        //task 11a
        for (int i = 1; i <= input ; i++){
            number = input % i;
            if(number == 0){
                count++;
            }

        }
        if (count == 2){
            System.out.println(input + " is a prime number.");
        }
        else {
            System.out.println(input + " is not a prime number.");
        }
        //task 11b
        for (int j = 1; j <= (input - 1); j++){
            number2 = input % j;
            
            if (number2 == 0){
                sum += j;
            } 
        }
        if (sum == input){
            System.out.println(input + " is a perfect number.");
        }
        else {
            System.out.println(input + " is not a perfect number.");
        }

    }
    
}
