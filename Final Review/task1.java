public class task1 {
    public static void main(String [] args){
        evenChecker(17);
        boolean result = isEven(10);
        System.out.println(result);
        boolean result1 = isPos(10);
        System.out.println(result1);
        sequence(-8);
    }
    //A
    public static void evenChecker(int num){
        if (num%2==0){
            System.out.println("Even!! ");
        }
        else {
            System.out.println("Odd!! ");
        }
    }
    //B
    public static boolean isEven(int num){
        if (num %2 == 0){
            return true;
        }
        else {
            return false;
        }
        
    }
    //C
    public static boolean isPos(int num){
        if (num > 0){
            return true;
        }
        else {
            return false;
        }
        
    }
    //D
    public static void sequence(int n){
        if (isPos(n)==true){
            for (int i =0; i<=n; i++){  
                if (isEven(i)==true){
                    System.out.print(i+" ");
                }
            }
        }
        else {
            for (int j = n; j<=-1;j++){
                if (isEven(j)==false){
                    System.out.print(j+" ");
                }
            }
        }
    }
}

