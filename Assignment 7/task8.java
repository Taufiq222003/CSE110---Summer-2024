import java.util.Scanner;
public class task8 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the length of array 1: ");
        int size = s1.nextInt();
        int arr1[] = new int[size];
        System.out.println("Please enter the elements of the arr1: ");
        for (int i=0; i<size ;i++){
            arr1[i]=s1.nextInt();
        }
        System.out.println("Enter the length of array 2: ");
        int size2 = s1.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Please enter the elements of the arr2: ");
        for (int j=0; j<size2 ;j++){
            arr2[j]=s1.nextInt();
        }

        int count = 0;
        for (int x = 0; x<size2 ; x++){
            for (int y =0; y<size ; y++){
                if (arr2[x]==arr1[y]){
                    count++;
                }
            }
        }
        if (count==size2){
            System.out.println("Array 2 is a subset of Array 1.");
        }
        else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }

    }
}
