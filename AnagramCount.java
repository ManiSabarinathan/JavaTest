import java.util.Arrays;
import java.util.Scanner;

class AnagramCount {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking strings as input
        String str1 = sc.next();
        String str2 = sc.next();

//        AnagramCount obj = new AnagramCount();
//        System.out.println("Is Anagram? :: " + obj.isAnagramCounting(str1, str2));


        int[] countArray = new int[256] ;
        for(int i =0;i<str1.length();i++){
            System.out.println("str1-charAt(i)" + str1.charAt(i));
            System.out.println("str2-charAt(i)" + str2.charAt(i));

            countArray[str1.charAt(i)]++;
            countArray[str2.charAt(i)]--;
        }

        for(int i=0;i<countArray.length;i++) {
            if(countArray[i]!=0) {
                System.out.println("Not an anagram");
            }
        }
    }

    private static int CHARACTER_RANGE= 256;

    public boolean isAnagramCounting(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;
            //count[string2.charAt(i)]--;
        }
        System.out.println("==> "+ Arrays.toString(count));
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}