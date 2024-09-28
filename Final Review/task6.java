
// problem 
public class task6 {
    public static void main(String [] args){
        String g = "baddadda";
        String g1 = "dd";
        String g2 = "n";
        modifyStrings(g, g1, g2);
    }

    public static void modifyStrings(String s1, String s2, String s3){
        String result = "";
        int i = 0;
        
        while (i < s1.length()) {
            // Check if the substring starting from i matches s2
            boolean match = true;
            for (int j = 0; j < s2.length(); j++) {
                if (i + j >= s1.length() || s1.charAt(i + j) != s2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            
            if (match==true) {
                result += s3;
                i += s2.length(); // Skip the length of s2
            } 
            else {
                result += s1.charAt(i);
                i++;
            }
        }
        
        System.out.println(result);
    }
}