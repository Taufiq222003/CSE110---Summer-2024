//task 2
import java.util.Scanner;
public class task2{
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your marks(0-100): ");
        int marks = s1.nextInt();
        String grade ;
        
        if (marks <= 100 && marks >= 90){
            grade = "A";
        }
        else if (marks <= 89 && marks >= 85){
            grade = "A-";
        }
        else if (marks <= 84 && marks >= 70){
            grade = "B";
        }
        else if (marks <= 69 && marks >= 57){
            grade = "C";
        }
        else if (marks <= 56 && marks >= 50){
            grade = "D";
        }
        else{
            grade = "F";
        }
        System.out.println("Your grade is " + grade);
    }
}