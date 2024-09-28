import java.util.Scanner;
public class task5{
    public static void main(String [] args){
        Scanner s1= new Scanner (System.in);
        System.out.println("Input: ");
        String inp = s1.nextLine();
        int vowel = 0;
        int cons = 0;
        String output = "";
        

        for (int l = 0 ; l<= inp.length()-1;l++){
            char ch = (char)(inp.charAt(l));

            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
                if (ch=='A' || ch=='E' || ch=='I'|| ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowel++;
                }
                else {
                    cons ++;
                }
            }    
        }
        if(vowel % 3 == 0 && cons % 5 ==0){
            output = "Aaarr! Me Plunder!!";
        }
        else{
            output = "Blimey! No Plunder!!";
        }
        System.out.println(output);
    }
}