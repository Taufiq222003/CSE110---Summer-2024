public class task7 {
    public static void main(String [] args){
        String [] email_list =  {"abc@gmail.com", "!@cv.bd",  "123cse@bracu.ac.bd"};
        int length = email_list.length;
        int validCount = 0;

        for (int i = 0 ; i < length; i++){
            String s1 = email_list[i];
            if (isValidEmail(s1)) {
                validCount++;
            }
        }

        System.out.println("Number of valid email addresses: " + validCount);
    }

    public static boolean isValidEmail(String email) {
        int atIndex = -1;
        int dotIndex = -1;
        boolean hasAt = false;
        boolean hasDot = false;

        // Check for '@' and '.' positions
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atIndex = i;
                hasAt = true;
            } 
            else if (email.charAt(i) == '.' && hasAt) {
                dotIndex = i;
                hasDot = true;
            }
        }

        // Check conditions
        if (!hasAt || !hasDot) {
            return false;
        }
        if (atIndex <= 0 || atIndex == email.length() - 1) {
            return false;
        }
        if (dotIndex <= atIndex + 1 || dotIndex == email.length() - 1) {
            return false;
        }
        if (!Character.isLetter(email.charAt(0))) {
            return false;
        }

        return true;
    }
}