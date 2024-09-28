import java.util.Scanner;
public class task7{
    public static void main(String[] args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Enter height of the triangle: ");
        int height = s1.nextInt();

        for (int out=1; out<= height; out++){
            
            for (int sp = 1; sp <= (height-out); sp++){
                System.out.print(" ");
            }
            for (int inn =1; inn<= out; inn++){
                System.out.print(inn);
            }
            for (int x = (out+1); x <= (out + (out-1)) ; x++){
                System.out.print(x);
            }
            System.out.println();

        }
    }
}