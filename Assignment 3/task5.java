//task 5
import java.util.Scanner;
public class task5{
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter year to check if leap year or not:");
        int year = s1.nextInt();

        if ((year % 4 == 0 ) || (year % 100 != 0 && year % 400 == 0)){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }

    }
}