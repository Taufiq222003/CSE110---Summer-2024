import java.util.Scanner;
public class task3 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input: ");
        String inp = s1.nextLine();
        System.out.println("Split character: ");
        char sp = s1.next().charAt(0);

        for (int l = 0; l < inp.length(); l++){
            if (inp.charAt(l)==sp){
                System.out.println();
            }
            else {
                System.out.print(inp.charAt(l));
            }
        }
    }
}
