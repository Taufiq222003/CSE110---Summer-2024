import java.util.Scanner;
public class prb12{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers: ");
    int even =0;
    int sum = 0;
    int average = 0;
    int max = 0;
    int min = 0;
    while (true){
      
      int numbers = sc.nextInt();
      if (numbers == 0){
        break;
      }
      else {
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
      
    }
    System.out.println("Max: " +max);
    System.out.println("Min: "+min);
    System.out.println(average);
  }
}