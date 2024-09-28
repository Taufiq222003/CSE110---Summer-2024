//task 10
import java.util.Scanner;
public class task10 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int input = s1.nextInt();
        int temp = input;
        int count = 0;
        int digits  ; 
    
        while (input > 0) { 
            input = input / 10;
            count++;
        }
        while (count != 0) { 
            int div = (int) Math.pow(10,count-1);
            digits = temp / div;
            if (temp % div == 0){
                System.out.print(digits);
            }
            else {
                System.out.print(digits + ", ");
            }
            
            
            temp = temp % div;
            
            count--;
        }

        
    }
}
