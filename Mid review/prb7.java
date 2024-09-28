import java.util.Scanner;
public class prb7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer N:");

        int n = sc.nextInt();
        int sum=0;
        for (int i = 1; i<=n ; i++){
            if (i%2==0){
                sum-= 2*i+1;

            }
            else {
                sum += 2*i+1;
            }
        }
        System.out.println(sum);
       
    }
}
