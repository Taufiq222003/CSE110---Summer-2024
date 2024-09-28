import java.util.Scanner;
public class task6 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Height of the Triangle");
        int height = s1.nextInt();


        for (int out = 1 ; out<= height;out++){
            for (int space = 1; space <= (height-out); space++){
                System.out.print(" ");
            }
            for (int inn = 1; inn <=out; inn++){
                System.out.print(inn);
            }
            System.out.println();
        }

    }
}
