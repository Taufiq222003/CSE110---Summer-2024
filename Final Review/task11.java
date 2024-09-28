// ARRATS (TASK-09)
public class task11 {
    public static void main(String [] args){
        char[] studentGrades = new char[]{'A', 'A', 'A', 'B', 'C', 'U', 'Z'};
        int[] studentScores = new int[7];
        getScores(studentGrades,studentScores);
    }
    public static void getScores(char[] ar1,int[]ar2){
        for (int i =0; i< ar2.length;i++){
            if(ar1[i]=='A'){
                ar2[i]=100;
            }
            else if (ar1[i]=='B'){
                ar2[i]=90;
            }
            else if (ar1[i]=='C'){
                ar2[i]=70;
            }
            else {
                ar2[i]=0;
            }
        }
        for (int j =0; j<ar2.length;j++){
            System.out.println(ar2[j]);
        }

    }
}
