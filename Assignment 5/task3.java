import java.util.Scanner;
public class task3 {
   public task3() {
   }

   public static void main(String[] args) {
      Scanner s1 = new Scanner(System.in);

      while(true) {
         System.out.println("Enter Number: ");
         int number = s1.nextInt();
         int count = 0;
         if (number % 2 != 0) {
            System.out.println("ODD Number detected.");
            break;
         }

         for(int inn = 1; inn <= number; ++inn) {
            int div = number % inn;
            if (div == 0) {
               ++count;
            }
         }

         System.out.println("" + number + " has " + count + " divisors.");
      }
   }
}
