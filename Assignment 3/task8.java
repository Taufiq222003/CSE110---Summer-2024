//task 8
import java.util.Scanner;
public class task8{
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your 8-digit student id : ");
        int student_id = s1.nextInt();

        int first_2 =  student_id / 1000000;
        int third_dig = student_id / 100000 % 10;
        
        if (third_dig == 1){
            System.out.println("Student Joined BRAC in Spring " + first_2);
        }
        else if (third_dig == 2){
            System.out.println("Student Joined BRAC in Fall " + first_2);
        }
        else if (third_dig == 3){
            System.out.println("Student Joined BRAC in Summer " + first_2);
        }

    }
}