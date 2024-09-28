import java.util.Scanner;
public class task6 {
    public static void main(String [] args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Enter size: ");
        int size = s1.nextInt();
        double [] arr1 = new double[size];
        
        for (int i=0; i<size;i++){
            System.out.println("Enter a number: ");
            arr1[i] = s1.nextDouble();
        }
        double max = arr1[0];
        double min = arr1[0];
        int maxIndex = 0;
        int minIndex = 0;
        double sum = 0.0 ;
        double avg = 0.0;
        for (int j = 0; j< size; j++){
            if (arr1[j]>max){
                max = arr1[j]; 
                maxIndex = j;
            }
            if (arr1[j]<min){
                min = arr1[j]; 
                minIndex = j;
            }
            sum += arr1[j];
        }
        avg = sum /size;
        System.out.println("Maximum element " +max+ " is found at index "+ maxIndex);
        System.out.println("Minimim element " +min+ " is found at index "+ minIndex);
        System.out.println("Summation: "+ sum);
        System.out.printf("Average:%.2f ", avg);

    }
}
