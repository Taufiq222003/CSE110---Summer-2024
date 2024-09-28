import java.util.Scanner;
public class task6{
    public static void main(String [] args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Input: ");
        String inp = s1.nextLine();
        String ans = "";
        String word = "";

        for (int l =inp.length()-1 ; l>=0;l--){
            char ch = (char)(inp.charAt(l));
            if (ch == ' '){
                ans += word + " ";
                word ="";
            }
            else {
                word = ch + word;
            }
        }
        ans +=word;
        System.out.println(ans);

    }
}