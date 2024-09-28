import java.util.Scanner;
public class task8{
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the first number of range: ");
        int start = s1.nextInt();
        System.out.println("Enter the last number of range: ");
        int end = s1.nextInt();
        System.out.println("Armstrong numbers: ");

        for (int i = start; i<= end; i++){
            int number = i;
            int div;
            int result = 0;
            int count = 0;
            int temp = number;

            while(temp != 0){
                temp = temp/10;
                count++;
            }
            temp = number;

            while(temp != 0){
                div = temp%10;
                result += Math.pow(div,count);
                temp = temp /10;
            }

            if (result == number){
                System.out.println(number);
            }
        }


    }
}