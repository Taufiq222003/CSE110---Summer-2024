import java.util.Scanner;
public class prb6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer n:");

        int n = sc.nextInt();
        double sum = 0.0;
        double y = 1.0;
        for (int i = 1; i<=n ; i++){
            if (i%4==0){
                y = 1.0/-i;
            }
            else {
                y = 1.0/i;
            }
            sum += y;
        }
        System.out.printf("%.4f%n",sum);
    }
}
