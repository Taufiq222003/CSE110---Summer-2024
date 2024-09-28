import java.util.Scanner;
public class task4 {
    public static void main(String [] args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Enter number of test cases: ");
        int test = s1.nextInt();
        
        for (int out = 1 ; out<= test; out++){
            System.out.println("Enter X"+out+": ");
            int x = s1.nextInt();
            System.out.println("Enter Y"+out+": ");
            int y = s1.nextInt();
            int sum=0;
            int count =0;
            
            for(int inn=x; count <y; inn++){
                if (inn%2 !=0){
                    sum += inn;
                    count++;
                }
            }
            System.out.println("The sum of first "+ y + " odd numbers starting from " + x + " is: " + sum);

        }
    }
}
