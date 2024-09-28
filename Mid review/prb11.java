import java.util.Scanner;
public class prb11{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("How many inputs do you want to provide? ");
    int input = sc.nextInt();
    System.out.println("Enter the numbers: ");
    int even =0;
    int sum = 0;
    int average = 0;
    int max = 0;
    int min = 0;
    for ( int i = 1; i<= input ; i++){
      int numbers = sc.nextInt();
      
      if (numbers %2 == 0 && numbers > 0){
        even++;
        if (even == 1){
         max = numbers;
         min = numbers;
        }
        else{
          if (numbers > max){
            max = numbers;
          }
          if (numbers< min){
            min = numbers;
          }
        }
        sum += numbers;
        average = sum / even;
            
      }
      
      if (even ==0){
        average = 0;
      }
      
      
    }
    System.out.println("Max: " +max);
    System.out.println("Min: "+min);
    System.out.println(average);
  }
}