import java.util.Scanner;
public class prb9 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int count=0;
        while (num >  0){
            num = num/10;
            count++;
        }
        System.out.println(count);
        while (count != 0 ){
            int div = (int)Math.pow(10,count-1);
            num = temp/div;
            sum +=  num;
            temp = temp % div;
            count--;
        }
        System.out.println("The sum is  "+ sum);
        

        if (sum % 2 == 0){
            System.out.println("The sum is even. ");
        }
        else if (sum %2 != 0 ){
            System.out.println("The sum is odd");
        }
        
        
           
    }
}
