//task7
import java.util.Scanner;
public class task7 {
    public static void main(String [] args){

        Scanner s1 = new Scanner(System.in);

        int sum = 0; 

        for(int x = 0; x < 10; x++){
            System.out.println("Enter number: ");
            int input = s1.nextInt();
            sum = sum + input;
            System.out.println("Sum = "+ sum);
            
            
        }

    }
}
