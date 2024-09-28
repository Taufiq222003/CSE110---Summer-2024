import java.util.Scanner;
public class prb1 {
    public static void main(String [] args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Enter total distance travelled:");
        int distance = s1.nextInt();
        System.out.println("Enter amount of fuel spent:");
        double fuel = s1.nextDouble();

        double consumption = distance / fuel;
        System.out.printf("%.3f km/l%n", consumption);
    }
    
}
