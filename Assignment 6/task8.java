import java.util.Scanner;
public class task8{
    public static void main(String [] args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Input: ");
        String inp = s1.nextLine();
        int count = 0;
        String ans = "";
        char ch ;
        for (int l = 0; l< inp.length(); l++){
            ch = inp.charAt(l);
            if ((ch >= 'A' && ch<= 'Z')|| (ch>='a'&&ch<= 'z')){
                count++;
            }
            if (count %2 != 0){
                if (ch >= 'A'&& ch<='Z'){
                    ch = (char)(ch+32);
                }
            }
            else{
                if (ch>= 'a'&& ch<= 'z'){
                    ch = (char)(ch-32);
                }
            }
            ans += ch;
        }
        System.out.println(ans);
    }
}