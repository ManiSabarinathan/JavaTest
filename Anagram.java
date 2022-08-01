import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String... args) {
        Anagram an = new Anagram();
        String str1 = "Adobe"; //Adobe-Abode //Binary-Brainy //anagram-nagaram //ac-bb
        String str2 = "Abode";
        boolean result = an.checkAnagram(str1, str2);
        System.out.println(result);
    }

    public boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }

//    public boolean checkAnagram(String str1, String str2) {
//        //Not the correct approach since sum could be matching with 2 different strings Ex: //ac-bb
//        if (str1.length() != str2.length()) {
//            return false;
//        }
//        int str1Count=0;
//
//        str1Count = str1.chars().boxed().collect(Collectors.summingInt(in -> in.intValue()));
//        System.out.println(str1Count);
//
//System.out.println();
//
//        int str2Count = str2.chars().boxed().collect(Collectors.summingInt( in -> in.intValue()));
//        System.out.println(str2Count);
//
//        if(str1Count==str2Count){
//            return true;
//        } else {
//            return false;
//        }
//    }
}
