public class task4 {
    public static void main(String [] args){
        boolean check = isPerfect(33);
        System.out.println(check);
    }

    public static boolean isPerfect(int num){
        int sum =0;
        for (int i=1; i< num;i++){
            if (num%i==0){
                sum += i;
            }
        }
        if (sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}
