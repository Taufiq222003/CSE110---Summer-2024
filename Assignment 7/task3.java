import java.util.Scanner;
public class task3{
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size  = s1.nextInt();
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];
        
        for (int i=0; i< size; i++){
            arr1[i] = s1.nextInt();     
        }
        //a
        for (int j=size-1; j>=0 ;j--){
            arr2[size-j-1] = arr1[j];
        }
        System.out.println("Reversed using a new array: ");
        for (int x = 0; x< size;x++){
            System.out.print(arr2[x]+" ");
        }

        //b
        int temp;
        for (int y=0; y<size/2; y++){
            temp = arr1[y];
            arr1[y] = arr1[size-y-1];
            arr1[size-y-1] = temp;
        }
        System.out.println();

        System.out.println("Reversed in the original array: ");

        for (int p =0; p<size; p++){
            System.out.print(arr1[p]+" ");
        }
       
        
    }
}