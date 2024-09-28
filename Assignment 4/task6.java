
//task6
import java.util.Scanner;
public class task6 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input the number of terms: ");
        int input = s1.nextInt();
        int terms = 1;
        int odd_numbers = 1;
        int sum = 0;
        System.out.println("The odd numbers are: ");
        while(terms <= input){
            if(odd_numbers % 2 != 0){

                System.out.println(odd_numbers);
                terms++;
                sum += odd_numbers;
            }
            odd_numbers++;
            
        }
        System.out.println("The Sum of odd Natural Numbers upto  "+ input + " terms is: "+ sum);


    }
}
