import java.util.Scanner;
public class task4{
    public static void main(String [] args){
        Scanner s1= new Scanner (System.in);
        System.out.println("Enter the size of array: ");
        int size = s1.nextInt();
        int [] arr1 = new int [size];

        for (int i =0; i< size;i++){
            arr1[i] =s1.nextInt();
        }
        System.out.println("Original array: ");
        for (int j=0; j< size ;j++){
            System.out.print(arr1[j]+" ");
        }

        for (int x =0; x<size ; x++){
            if (arr1[x]>0){
                arr1[x] = 1;
            }
            else if (arr1[x]<0 || arr1[x]==0){
                arr1[x] = 0;
            }
        }
        System.out.println("After modifying: ");
        for (int y=0; y< size ;y++){
            System.out.print(arr1[y]+" ");
        }
    }
}