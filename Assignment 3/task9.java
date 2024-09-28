//task 9
import java.util.Scanner;
public class task9{
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your total salary: ");
        int salary = s1.nextInt();
        System.out.println("Enter your age: ");
        int age = s1.nextInt();

        int tax1 = salary * 5 / 100;
        int tax2 = salary * 10 /100;

        if (salary < 10000) {     

            System.out.println("Your TAX amounts is 0 Tk");    

        } 
        else if (salary >= 10000 && salary <= 20000) {

            if (age < 18) {
                System.out.println("Your TAX amounts is 0 Tk");
            }
            else{
                System.out.println("Your TAX amounts is " + tax1 + " Tk"); 
            }
            
        } 

        else {
            
            if (age < 18) {
                System.out.println("Your TAX amounts is 0 Tk");
            }
            else{
                System.out.println("Your TAX amounts is " + tax2 + " Tk"); 
            }
        }
        
}   
}