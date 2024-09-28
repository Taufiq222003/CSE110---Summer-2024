import java.util.Scanner;
public class prb2 {
    public static void main(String [] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter code number:");
        int code = s1.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = s1.nextInt();
        String item = "";
        double price = 0;
        if(code == 1){
            item = "Hot Dog";
            price = 4.00;
        }
        else if(code == 2){
            item  = "X-Salad";
            price = 4.50;
        }
        else if(code == 3){
            item = "X-Bacon";
            price = 5.00;
        }
        else if(code == 4){
            item = "Toast";
            price = 2.00;
        }
        else if(code == 5){
            item ="Soda";
            price = 1.50;
        }
        else{
            System.out.println("Invalid input");
        }
        System.out.println("Item: "+ item);
        System.out.println("Quantity: "+ quantity);
        System.out.printf("Total: $ %.2f" , price * quantity );
    }
}
