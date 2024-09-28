public class task2 {
    public static void main(String [] args){
        double area = circleArea(5);
        System.out.println(area);
        double volume = sphereVolume(5);
        System.out.printf("%.4f\n",volume);
        findSpace(5,"sphere");
    }
    //A
    public static double circleArea(int radius){
        double ans = 3.1416*radius*radius;
        return ans;
    }
    //B
    public static double sphereVolume(int radius){
        double ans1 = (4.0/3.0)*(3.1416 * radius * radius * radius); 
        return ans1;
    }
    public static void findSpace(int diameter, String nm){
        if (nm == "circle"){
            double ans2 = circleArea(diameter/2);
            System.out.println(ans2);
        }
        else if (nm == "sphere"){
            double ans3 = sphereVolume(diameter/2);
            System.out.println(ans3);
        }
        else {
            System.out.println("Wrong Parameter. ");
        }
    }
}
