import java.util.Scanner;
public class prb5 {
    public static void main(String [] args){
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the first value :");
        int first = s1.nextInt();
        System.out.println("enter change :");
        int change = s1.nextInt();
        System.out.println("enter the last value :");
        int last = s1.nextInt();

        for (int i = first; i<=last; i+=change){
            if (i+change>last){
                System.out.println(i);
            }
            else {
                System.out.print(i+ ", ");
            }
        }

    }
}
