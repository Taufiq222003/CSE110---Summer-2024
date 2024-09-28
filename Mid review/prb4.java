import java.util.Scanner;
public class prb4 {
    public static void main(String [] args){
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter A:");
        double a = s1.nextDouble();
        System.out.println("Enter B:");
        double b = s1.nextDouble();
        System.out.println("Enter C:");
        double c = s1.nextDouble();

        double discri = Math.pow(b,2)-(4*a*c);
        double root = Math.sqrt(discri);
        double div = 2*a;
        double ans1 = (-b + root) / div;
        double ans2 = (-b - root) / div;
        if (discri < 0 || div == 0 ){
            System.out.println("Impossible to calculate.");

        } 
        else {
            System.out.printf("Root#1 = %.5f %n" , ans1);
            System.out.printf("Root#2 = %.5f %n" , ans2);
        }


    }
}
