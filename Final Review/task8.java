public class task8{
    public static void main(String [] args){
        boolean check = isHappyNumber(88);
        System.out.println(check);
    }

    public static boolean isHappyNumber(int num){
        
        while (num != 1 && num != 4){
            int sum =0;
            while (num>0){
                int digit = num%10;
                sum += digit * digit;
                num /= 10;
            }
            num =sum;

        }
        return num==1;
    }
}