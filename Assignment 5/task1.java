import java.util.Scanner;
public class task1{
    public static void main(String [] args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Enter a positive integer: ");
        int num = s1.nextInt();
        int count = 0;
        int num2 = 0;
        int count2 = 0;
        
       for (int out = 2; out > 0 ; out++){
        for (int inn = 1; inn <= out; inn++){
            num2 = out%inn;
            if (num2 == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println(out);
            count2++;
        }
        count = 0;
        if (count2 == num ){
            break; 
           }
       }
       

       
        
    }
}