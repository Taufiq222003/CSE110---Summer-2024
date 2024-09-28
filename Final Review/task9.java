//Strings + Methods (TASK-05)
import java.util.Scanner;
public class task9 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter binary Number: ");
        String binary = s1.next();
        int ans = toDecimal(binary);
        System.out.println(ans);
        System.out.println(toHex(ans));
        s1.close();
    }
    
    public static int toDecimal(String str){
        int decimal =0;
        int size = str.length();
        for (int i =0; i<size;i++){
            int num =str.charAt(i)-'0';
            decimal += num *(int)(Math.pow(2,(size-1-i)));
        }
        return decimal;      
    }
    public static String toHex(int ans){
        String hex = "";
        while(ans>0){
            int rem = ans%16;
            if(rem<10){
                hex = rem + hex;
            }
            else{
                hex = (char)(rem-10+'A') + hex;
            }
            ans = ans/16;
        }
        return hex;
    }
}
