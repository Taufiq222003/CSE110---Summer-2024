public class task3 {
    public static void main(String [] args){
        boolean check = isPrime(15);
        System.out.println(check);

    }
    public static boolean isPrime(int num){
        int count =0;
        for (int i =1; i<=num;i++){
            if (num%i==0){
                count++;
            }
        }
        if (count == 2){
            return true;
        }
        else{
            return false;
        }
    }
}
