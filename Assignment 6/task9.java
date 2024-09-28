import java.util.Scanner;
public class task9 {
    public static void main(String [] args){
        Scanner s1= new Scanner(System.in);
        System.out.println("Input Password: ");
        String pass = s1.nextLine();
        int upp = 0;
        int low = 0;
        int dig = 0;
        int sym =0;
        boolean strong = false;
        char ch;

        for (int l = 0; l < pass.length(); l++){
            ch = pass.charAt(l);
            if(ch>='A' && pass.charAt(l)<= 'Z'){
                upp++;
            }
            else if(ch>= 'a' && ch<= 'z'){
                low++;
            }
            else if(ch>= '0' && ch<= '9'){
                dig++;
            }
            else{
                sym++;
            }
            
            
        }
        if (pass.length()>= 8 && upp >=1 && low>=1 && dig >=1 && sym >=1){
            strong = true;
        }
        else{
            strong = false;
        }
        System.out.println(strong);
    } 
}
