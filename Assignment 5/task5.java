import java.util.Scanner;
public class task5 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter breadth of rectangle: ");
        int breadth = s1.nextInt();
        System.out.println("Enter length of triangle: ");
        int length = s1.nextInt();

        for (int len = 1; len <= length; len ++){
            for (int br =1; br <= breadth; br++){
                System.out.print(br+ " ");
            }
            System.out.println();
        }

    }
}
