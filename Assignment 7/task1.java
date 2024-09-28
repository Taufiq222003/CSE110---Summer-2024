//task1

import java.util.Scanner;
public class task1{
    public static void main(String [] args){
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size = s1.nextInt();
        int [] arr = new int[size];
        
        for (int i = 0; i< size; i++){
            System.out.println("Enter a number: ");
            arr[i] = s1.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for (int j =0; j<size; j++){
            System.out.println(j+":"+arr[j]);
        }
        System.out.println("Enter another number: ");

        int  [] arr2 = new int [size+1];
        for (int x = 0; x < size; x++){
            arr2[x] = arr[x];
        }
        arr2[size] = s1.nextInt();
        System.out.println("After resizing the array: ");
        for (int y=0; y<=size; y++){
            System.out.print(arr2[y]+" ");
        }
        
    }
}