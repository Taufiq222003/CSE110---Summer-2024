import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Input: ");
        String text = s1.nextLine();
        
        for (int num =0; num< text.length(); num++){
            if (text.charAt(num)>= 97 && text.charAt(num)<= 122){
                char capital = (char)(text.charAt(num)-32);
                System.out.print(capital);
            }
            else{
                char normal = (char)(text.charAt(num));
                System.out.print(normal);
            }
            if (text.charAt(num)==64){
                System.out.println(" ");
            }
        }
        
    }
    

}