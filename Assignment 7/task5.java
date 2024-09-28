import java.util.Scanner;
public class task5 {
    public static void main(String [] args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Enter size: ");
        int size = s1.nextInt();
        int [] arr1 = new int[size];
        
        for (int i=0; i<size;i++){
            System.out.println("Enter a number: ");
            arr1[i] = s1.nextInt();
        }
        System.out.println("Enter a number to check its position: ");
        int num = s1.nextInt();
        for (int j = 0; j< size; j++){
            if (arr1[j]==num){
                System.out.println(arr1[j] + " is at index "+j);
            }
            else{
                if (j<size-1){
                    continue;
                }
                System.out.println("Element not found.");
            }
        }
    }
}
