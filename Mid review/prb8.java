import java.util.Scanner;
public class prb8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer N:");

        int n = sc.nextInt();
        System.out.println("Collatz sequence: ");
        System.out.print(n+", ");
        while (n !=1 ){
        
            if (n%2==0){
                n = n/2;
                
            }
            else if(n%2 != 0){
                n = 3*n+1;
                
            }
            
            if (n==1){
                System.out.println(n);
            }  
            else {
                System.out.print(n+", ");
            }
        }
        
           
    }
}
