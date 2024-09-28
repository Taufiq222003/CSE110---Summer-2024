import java.util.Scanner;
public class prb10{
  public static void main(String [] args){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter a binary number.");
    int binary = s1.nextInt();
    
    int decimal = 0;
    int power = 0;
    while(binary!= 0){
      int lastDigit = (int)(binary%10);
      decimal = decimal + lastDigit * (int)Math.pow(2,power);
      power++;
      binary = binary /10;
      
    }
    System.out.println(decimal);
  }
}