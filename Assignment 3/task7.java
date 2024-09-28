//task 7
import java.util.Scanner;
public class task7{
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the value of x for f(x) : ");
        int value = s1.nextInt();
        

        if (value < 0){
            System.out.println("output: " + (2 * value));
        }
        else if(value >= 0 && value < 2){
            System.out.println("output: " + (value + 1));
        }
        else if (value >= 2 && value < 5){
            System.out.println("output: " + ( (value * value) - 1));
        }
        else if (value >= 5){
            System.out.println("output: " + (3 * (value * value) + 2));
        }

    }
}