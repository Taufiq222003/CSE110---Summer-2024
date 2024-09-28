//task8
import java.util.Scanner;
public class task8 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a postive integer: ");
        int number = s1.nextInt();
        System.out.println("The numbers divisible by 5 but not 3 are :");

        for(int i = 1; i <= number; i++){
            if(i % 5 == 0 && i % 3 != 0){
                System.out.println(i);
            }
             
        }


    }
}
