import java.util.Scanner;
public class prb3 {
    public static void main(String [] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the first abscissa:");
        double x1 = s1.nextDouble();
        System.out.println("Enter the first ordinate");
        double y1 = s1.nextDouble();
        System.out.println("Enter the second abscissa:");
        double x2 = s1.nextDouble();
        System.out.println("Enter the second ordinate:");
        double y2 = s1.nextDouble();

        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double slope = (y2-y1)/(x2-x1);
        System.out.printf("Distance :%.4f %n", distance);
        System.out.printf("Slope :%.4f %n", slope);
        if (slope > 0){
            System.out.println("The slope is Positive");
        }
        else if(slope == 0){
            System.out.println("The slope is Zero.");
        }
        else {
            System.out.println("The slope is Negative.");
        }
    }
    
}

