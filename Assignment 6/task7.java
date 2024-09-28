import java.util.Scanner;
public class task7 {
    public static void main(String [] args){
        Scanner s1= new Scanner (System.in);
        System.out.println("Enter the first word in small letter: ");
        String w1 = s1.next();
        System.out.println("Enter the second word in small letter: ");
        String w2 = s1.next();
        String ans = "";

        for (int x = 0 ; x < w1.length(); x++){
            char ch1 =(char)(w1.charAt(x)-32);
            boolean found = false;
            for (int y =0; y< w2.length();y++){
                char ch2 =(char)(w2.charAt(y)-32);
                if (ch1==ch2){
                    found = true;
                }
            }
            if (found == false){
                ans += ch1;
            }
        }
        for (int x = 0 ; x < w2.length(); x++){
            char ch1 =(char)(w2.charAt(x)-32);
            boolean found = false;
            for (int y =0; y< w1.length();y++){
                char ch2 =(char)(w1.charAt(y)-32);
                if (ch1==ch2){
                    found = true;
                }
            }
            if (found == false){
                ans += ch1;
            }
        }
        
        System.out.println(ans);

        
       
    }
}
