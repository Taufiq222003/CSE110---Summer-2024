//task 9
import java.util.Scanner;
public class task9 {
    public static void main(String [] args){

        Scanner s1 = new Scanner(System.in);
        System.err.println("Enter a positive number:");
        int input = s1.nextInt();

    
        int count = 0;

        while (input > 0){
            input = input / 10;
            count++;
        }
        System.out.println("Total digits = " + count);

    }
}
