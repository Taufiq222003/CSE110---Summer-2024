//task11
import java.util.Scanner;
public class task11{
  public static void main(String [] args){
    
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter the value of side 1");
    int side1 = s1.nextInt();
    System.out.println("Enter the value of side 2");
    int side2 = s1.nextInt();
    System.out.println("Enter the value of side 3");
    int side3 = s1.nextInt();
    
    if (side1 == side2 && side2 == side3){
      System.out.println("This is an Equilateral triangle");
    }
    else if (side1 != side2 && side2!= side3){
      System.out.println("This is an Scalene triangle");
    }
    else if ((side1 == side2 && side2 != side3) || (side1 != side2 && side2 == side3) || (side3 == side1 && side3 != side2)){
      System.out.println("This is an Isosceles triangle");
    }
}
  }
  