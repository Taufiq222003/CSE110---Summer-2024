// Arrays + Strings + Methods (TASK-11)
public class task13 {
    public static void main(String [] args){
        int ans = isVowel("The quick brown fox jumps over the lazy dog");
        System.out.println(ans);
        int ans2 = isConsonant("The quick brown fox jumps over the lazy dog");
        System.out.println(ans2);
        String [] arr1 ={"Bob", "Alice", "Max", "Marry", "Rosy"};
        int sumVowel = vowelSum(arr1);
        System.out.println("The total number of vowels in the array is: "+sumVowel);
        int sumConsonant = consonantSum(arr1);
        System.out.println("The total number of consonants in the array is: "+sumConsonant);
    }
    public static int isVowel(String s1){
        int vowel = 0;
        for (int i=0; i<s1.length();i++){
            char ch = (char)(s1.charAt(i));
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowel++;
            }
        }
        return vowel;
    }
    public static int isConsonant(String s1){
        int consonant = 0;
        for (int j=0; j<s1.length();j++){
            char ch1 = (char)(s1.charAt(j));
            if ((ch1>=65 && ch1<=90)||(ch1>=97 && ch1<=122)){
                if (ch1!='a'&&ch1!='e'&&ch1!='i'&&ch1!='o'&&ch1!='u'&&ch1!='A'&&ch1!='E'&&ch1!='I'&&ch1!='O'&&ch1!='U'){
                    consonant++;
                }
            }  
        }
        return consonant;
    }
    public static int vowelSum(String [] arr){
        int sum =0;
        for (int p =0; p<arr.length; p++){
            String x = arr[p];
            int res = isVowel(x);
            sum += res;
        }
        return sum;
    }
    public static int consonantSum(String [] arr){
        int sum1 =0;
        for (int q =0; q<arr.length; q++){
            String y = arr[q];
            int res1 = isConsonant(y);
            sum1+= res1;
        }
        return sum1;
    }


}
