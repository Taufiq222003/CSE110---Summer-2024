public class task2{
    public static void main(String [] args){
        int arr [] = {9, -5, 7, 9, -5, 5, 7};
        System.out.println("Before removing duplicates: ");
        for (int loop =0; loop<arr.length;loop++){
            System.out.print(arr[loop]+ " ");
        }
        System.out.println();
        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }
        System.out.println("After replacing duplicates with 0: ");
        for (int x= 0; x< arr.length; x++){
            System.out.print(arr[x]+ " ");
        }
    }
}