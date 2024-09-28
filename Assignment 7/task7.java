public class task7{
     public static void main(String []args){
          int arr1[]={23,100,23,56,100};
          int[]  arr2=new int[arr1.length];
          System.out.println("Input array: ");
          for(int i=0;i<arr1.length;i++){
               System.out.print(arr1[i]+" ");
          }
          System.out.println();
          System.out.println("New array: ");
          int count=0;
          for(int i=0; i<arr1.length;i++){
               boolean repeat = false;
               for(int j=0;j<count;j++){
                    if(arr1[i]==arr2[j]){
                         repeat=true;
                    }
               }
               if(repeat==false){
                    arr2[count] = arr1[i];
                    count++;
               }
          }
          for(int i=0;i<arr2.length;i++){
               if(arr2[i]!=0){
                    System.out.print(arr2[i]+" ");
               }
          }
     }
}