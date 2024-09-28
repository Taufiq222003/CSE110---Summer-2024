import java.util.Scanner;
public class task4 {
    public static void main(String [] args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Input: ");
        String inp = s1.nextLine();

        for (int loop = (inp.length()-1); loop>=0;loop--){
            System.out.print(inp.charAt(loop));
        }
    }
}
