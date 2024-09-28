import java.util.Scanner;
public class task2 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the value of N(N>0): ");
        int N = s1.nextInt();
        int sum =0;
        int sum2 =0;

        for (int out = 1; out <= N; out++){
            for (int inn = 1; inn<= out; inn++){
                sum = sum + inn;
                sum2 = -sum;
            }
        }
        System.out.println("The value of y is: "+ sum2);
    }
}
